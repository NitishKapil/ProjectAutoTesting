package Task;

public class StaticM {

    static int Add(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {

        int sum = Add(12,3);
        System.out.println("Add two Number without instance:->" +sum);

    }

}
