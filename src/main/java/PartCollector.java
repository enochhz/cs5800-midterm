public class PartCollector extends Employee{

    public PartCollector() {
        this.authorityLevel = Employee.PART_COLLECTOR;
    }

    public void write(String message) {
        System.out.println(message + "all parts have been gathered");
    }
}
