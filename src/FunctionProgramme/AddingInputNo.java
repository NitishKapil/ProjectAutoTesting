package FunctionProgramme;

public class AddingInputNo {
    public static void main(String args[]) {
        int a = 11;
        int sum=addno(a);
        System.out.println(sum);
    }

    static int addno(int a) {
    int b,c=0;
        while (a != 0) {
            b = a % 10;
            c = c + b;
            a = a / 10;

        }
        return c;
    }

}




