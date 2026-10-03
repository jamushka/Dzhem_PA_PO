import java.io.PrintStream;
public class Hello_impl implements Hello {
    @Override
    public void printHelloWorld(PrintStream out) {
        out.print("Hello, World!\n");
    }
}