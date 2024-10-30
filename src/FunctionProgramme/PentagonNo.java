package FunctionProgramme;

public class PentagonNo {
    public static void main(String [] args)
    {
        double invest=1000;
        double rate=10;
        double year=5;

        for(year=1;year<=5;year++)
        {
            double future = invest*(1+rate/10)*year;
           System.out.println(future);
        }



        }
    }


