package Association;

public class StdMthd {
    String name;
    String roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "StdMthd{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                '}';
    }
}
