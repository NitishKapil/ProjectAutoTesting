package Association;

public class StdSchool {
    private String school;
     StdDetails s;

    public StdSchool(StdDetails s) {
        this.s = s;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public StdDetails getS() {
        return s;
    }

    public void setS(StdDetails s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s.getName() +" " +s.getRollno();
    }
}
