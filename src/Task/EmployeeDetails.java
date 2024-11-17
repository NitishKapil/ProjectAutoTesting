package Task;

public class EmployeeDetails {
    String firstName;
    String lastName;

    EmployeeDetails(String frst,String lst)
    {
        this.firstName=frst;
        this.lastName=lst;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
class Emp extends EmployeeDetails
{
   String id;
   String jobTitle;
   Emp(String id,String jobTitle)
   {
   super("karan","Kapil");
   this.id=id;
  this.jobTitle=jobTitle;
   }

    public String getId() {
        return id;
    }
    @Override
    public String getLastName() {
        return lastName + "," +jobTitle ;
    }
}
class Allinfo
{
    public static void main(String [] args)
    {
        Emp e= new Emp("12","QA");
        System.out.println(e.getId() +"\n" + e.getFirstName() +"\n" + e.getLastName() +"\n");
    }
}