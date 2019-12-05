public class Painter extends Employee {

    public Painter() {
        this.authorityLevel = Employee.PAINTER;
    }

    public void write(String[] message) {
        message[0] += "Car complete.\n";
    }
}
