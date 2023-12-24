public class Test{
    public static void main(String[] args) {
        /*
        new Csv().getCsv("src\\Personaggi.csv");
        System.out.println("\n\n\n\n");
         */
        Parser p = new Parser();
        String aString = "9";
        int aInt = p.parseInt(aString);
        System.out.print("String " + aString + ":\t" + aInt);
    }
}