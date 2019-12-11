public class Assembler extends Employee{

    public Assembler() {
        this.authorityLevel = Employee.ASSEMBLER;
    }

    public void write(String message) {
        System.out.println(message + "all parts have been put together");
    }
}
