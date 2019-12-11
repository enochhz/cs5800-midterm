public class Welder extends Employee{

    public Welder() {
        this.authorityLevel = Employee.WELDER;
    }

    public void write(String message) {
        System.out.println(message + "all parts have been welded together");
    }
}
