import java.io.File;
import java.io.FileInputStream;

public class readfile {
    String type;
    Integer price;
    public void set() {

        // Creating file object and specifying path
        File file = new File("input.txt");
        String s1="",s2="";

        try {
            FileInputStream input= new FileInputStream(file);
            int character;
            // read character by character by default
            // read() function return int between 0 and 255.
            input.skip(18);
            while ((character = input.read()) != '}')
            {

                s1=s1+(char)character;
            }
            input.skip(8);
            while ((character = input.read()) != '}')
            {

                s2=s2+(char)character;
            }

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        this.type=s1;
        this.price=Integer.parseInt(s2);
    }
}