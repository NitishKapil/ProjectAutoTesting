package Task;

public class Person {
    private String name;
    private int age;
    private String country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name=="null" || name.isEmpty())
        {
            System.out.println("NO name is added");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
class Person1
{
    public static void main(String[] args) {
        Person p = new Person();
        //p.setName("");
        p.setAge(12);
        p.setCountry("India");
        System.out.println(p.getName() +"\n" +p.getAge() +"\n" +p.getCountry());
    }
}