/**
 * Generates an arithmetic progression.
 */
public class ArithmeticProgression extends AbstractProgression {
    protected long increment;
    public ArithmeticProgression() { this(1, 0); }
    public ArithmeticProgression(long stepsize) { this(stepsize, 0); }

    public ArithmeticProgression(long stepsize, long start) {
        super(start);
        increment = stepsize;
    }

    protected void advance() {
        current += increment;
    }
}
