public class Assembler extends Employee{

    public Assembler() {
        this.authorityLevel = Employee.ASSEMBLER;
    }

    public void write(String[] message) {
        message[0] += "All parts have been put together.\n";
    }
}
