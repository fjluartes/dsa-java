/**
 * Generates a simple progression. By default: 0, 1, 2, ...
 */
public class Progression {
    protected long current;

    // constructor progression starting with zero
    public Progression() { this(0); }

    // constructor progression with start value
    public Progression(long start) { current = start; }

    public long nextValue() {
        long answer = current;
        advance();
        return answer;
    }

    // get next value in progression
    protected void advance() {
        current++;
    }

    public void printProgression(int n) {
        System.out.print(nextValue());
        for (int j = 1; j < n; j++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }
}
