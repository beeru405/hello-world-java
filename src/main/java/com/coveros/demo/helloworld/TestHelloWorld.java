import java.io.PrintStream;

public class TestHelloWorld {

    public final static void main(String[] args) {
        doPrint(System.out);
    }

    static void doPrint(PrintStream ps) {
        ps.println("Hello World");
    }
}
