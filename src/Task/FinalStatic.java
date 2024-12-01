package Task;

public class FinalStatic {
    final static double a =3.14;

         double areaCircle(int r)
         {
             return 2*a*r*r;
         }

    public static void main(String[] args) {
        FinalStatic m = new FinalStatic();
        System.out.println(m.areaCircle(3));
    }
}


