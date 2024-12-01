package Task;

public class TryCatch {
    public static void main(String[] args) {
        int a = 12;
        int b = 00;
        try {
            int c = a / b;
            String nam = null;
            nam.trim();
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Arithmetic exception");
        } finally {
            System.out.println("i will alway executed");
        }
        System.out.println("END the CODE");
    }
}
