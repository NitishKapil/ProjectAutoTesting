package Task;

public class ConstructorPrgmme {

    private String className;
    private String[] Student;


    ConstructorPrgmme(String className, String[] student) {
        this.className = className;
        Student = student;
    }

    void display() {
        System.out.println(className);
        for (String n : Student) {
            System.out.println(n);
        }
    }


    public static void main(String[] args) {
        String[] name = {"S!", "S2", "S3"};
        ConstructorPrgmme con = new ConstructorPrgmme("KAPIL", name);
        con.display();
    }
}