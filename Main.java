
public class Main {
    public static void main(String[] args) {
        dic mydic=new dic();
        mydic.words=readfile.read();
        System.out.println("Words Star with n:");
        mydic.wordsstartwithN();
        System.out.println("\n"+"\n"+"Words whose length is 7:");
        mydic.wordswithlength7();
        System.out.println("\n"+"\n"+"Words that grouped by first 3 letters:");
        mydic.groupbyfirst3letters();
        System.out.println("\n"+"Number of vowels:");
        mydic.countvowels();
        System.out.println("\n"+"Words that start with (a-h):");
        mydic.wordsstartwithAH();
        System.out.println("\n"+"\n"+"Palindromes:");
        mydic.palindromes();
        System.out.println("\n"+"\n"+"Words start with a and end with z:");
        mydic.startAendZ();
        System.out.println("\n"+"\n"+"The longest word:");
        mydic.longestword();


        }
    }
