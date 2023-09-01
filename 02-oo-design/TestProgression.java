public class TestProgression {
    public static void main(String[] args) {
        Progression prog;
        System.out.print("Arithmetic: ");
        prog = new ArithmeticProgression(2, 2);
        prog.printProgression(10);
        System.out.print("Geometric: ");
        prog = new GeometricProgression(2, 2);
        prog.printProgression(10);
        System.out.print("Fibonacci: ");
        prog = new FibonacciProgression(2, 2);
        prog.printProgression(10);
    }
}
