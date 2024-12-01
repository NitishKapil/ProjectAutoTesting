package Association;

public class MainM {
    public static void main(String[] args) {
        StdDetails s = new StdDetails();
        s.setName("kartan");
        s.setRollno("12");
        StdSchool s1 = new StdSchool(s);
        System.out.println(s1);
        System.out.println(s1.getS().getName());


    }
}
