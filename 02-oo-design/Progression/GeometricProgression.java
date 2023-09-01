/**
 * Generates a geometric progression.
 */
public class GeometricProgression extends Progression {
    protected long base;

    // constructor progression start 1, base of 2
    public GeometricProgression() { this(2, 1); }

    // constructor progression start 1 base of b
    public GeometricProgression(long b) { this(b, 1); }

    public GeometricProgression(long b, long start) {
        super(start);
        base = b;
    }

    // multiplies geometric base to current value
    protected void advance() {
        current *= base;
    }
}
