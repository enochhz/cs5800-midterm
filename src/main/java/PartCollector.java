public class PartCollector extends Employee{

    public PartCollector() {
        this.authorityLevel = Employee.PART_COLLECTOR;
    }

    public void write(String[] message) {
        message[0] += "All parts have been gathered.\n";
    }
}
