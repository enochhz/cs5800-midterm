public class Main {

    public static void main(String[] args) {
        Employee partCollector = new PartCollector();
        Employee assembler = new Assembler();
        Employee welder = new Welder();
        Employee painter = new Painter();
        partCollector.setNextEmployee(assembler);
        assembler.setNextEmployee(welder);
        welder.setNextEmployee(painter);
        String[] message = new String[]{""};
        partCollector.doWork(4, message);
        System.out.println(message[0]);
    }
}
