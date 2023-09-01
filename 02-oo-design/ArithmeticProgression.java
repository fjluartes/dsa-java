/**
 * Generates an arithmetic progression.
 */
public class ArithmeticProgression extends Progression {
    protected long increment;

    // constructor progression start 0 increment 1
    public ArithmeticProgression() { this(1, 0); }

    // constructor progression start 0 increment stepsize
    public ArithmeticProgression(long stepsize) { this(stepsize, 0); }

    public ArithmeticProgression(long stepsize, long start) {
        super(start);
        increment = stepsize;
    }

    // adds arithmetic increment to current value
    protected void advance() {
        current += increment;
    }
}
