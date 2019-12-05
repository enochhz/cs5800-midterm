public class Welder extends Employee{

    public Welder() {
        this.authorityLevel = Employee.WELDER;
    }

    public void write(String[] message) {
        message[0] += "All parts have been welded together.\n";
    }
}
