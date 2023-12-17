public class Main {

    public static void main(String[] args) {

        readfile file=new readfile();
        file.set();

        switch(file.type) {
            case "HATCHBACK":
                HATCHBACK a = new HATCHBACK(file.price);
                System.out.println("HATCHBACK"+" : "+a.price);
                break;
            case "SEDAN":
                SEDAN b = new SEDAN(file.price);
                System.out.println("SEDAN"+" : "+b.price);
                break;
            case "SUV":
                SUV c = new SUV(file.price);
                System.out.println("SUV"+" : "+c.price);
                break;
            case "PICKUP":
                PICKUP d = new PICKUP(file.price);
                System.out.println("PICKUP"+" : "+d.price);
                break;
        }


    }


}