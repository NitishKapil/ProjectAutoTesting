package Task;

public class Task1610Greatest {
    public static void main(String[] args) {
        int a=12;int b=12;int c=12;
        String max = (a>b && a>c)?"A is greatest":(b>a && b>c)?"B is greatest":(c>a && c>b)?"C is greatest":"EQUaLS";
        System.out.println(max);
    }

}
