public class Main {
    public static void main(String[] args) {
        From objectFrom = new From("From", 1);
        To objectTo = new To("To", 2);
        BeanUtils.assign(objectTo, objectFrom);
        System.out.println("The string field matches: " + (objectFrom.getName().equals(objectTo.getName())));
        System.out.println("The numeric field matches: " + (objectFrom.getNumber().equals(objectTo.getNumber())));
    }
}