package Oct.exe_78112024;

public class ATBstudent {
    int rollno;
    int mark;
    String name;
    ATBstudent(String st_name,int st_rollno,int st_mark){
        this.mark = st_mark;
        this.name= st_name;
        this.rollno  = st_rollno;

    }

    @Override
    public String toString() {
        return "name : "+name + " mark :" +mark+ " rollno " + rollno;
    }

    public static void main(String[] args) {
        ATBstudent[] student = new ATBstudent[3];
        student[0] = new ATBstudent("krishna",06,98);
        student[1] = new ATBstudent("mohan",9,91);
        student[2] = new ATBstudent("panda",1,99);

        for(ATBstudent students:student){
            System.out.println(students);
        }
    }
}
