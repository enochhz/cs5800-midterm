public class Painter extends Employee {

    public Painter() {
        this.authorityLevel = Employee.PAINTER;
    }

    public void write(String message) {
        System.out.println(message + "car complete");
    }
}
