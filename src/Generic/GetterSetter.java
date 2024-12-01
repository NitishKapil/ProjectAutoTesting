package Generic;

public class GetterSetter {
    private String name;
    private int age;

    public GetterSetter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void display()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    @Override
    public String toString() {
        return "GetterSetter{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                '}' ;
    }
}
