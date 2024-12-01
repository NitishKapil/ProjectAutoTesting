package Association;

public class JVMGet {
    public static void main(String[] args) {
        StdMthd mn = new StdMthd();
        System.out.println(mn);
        SetStdV s = new SetStdV();
        s.Std(mn);
        System.out.println(mn);

    }
}
