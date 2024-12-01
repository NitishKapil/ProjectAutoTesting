package Task;

public class MainCValue {
    public static void main(String[] args) {
        CurrenyCountry c = new CurrenyCountry(120,"INR");
        CurrenyCountry c1=new CurrenyCountry(200,"INR");
        int total = c.add(c1);
        System.out.println(total);
    }
}
