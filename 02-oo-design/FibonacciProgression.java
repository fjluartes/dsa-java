/**
 * Generates a fibonacci progression.
 */
public class FibonacciProgression extends Progression {
    protected long prev;

    // constructor traditional fibonacci
    public FibonacciProgression() { this(0, 1); }

    public FibonacciProgression(long first, long second) {
        super(first);
        prev = second - first;
    }

    // replace (prev, current) with (current, current+prev)
    protected void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }
}
