/**
 * Abstract class for Progression
 */
public abstract class AbstractProgression {
    protected long current;
    public AbstractProgression() { this(0); }
    public AbstractProgression(long start) { current = start; }

    public long nextValue() { // concrete method
        long answer = current; 
        advance(); // protected call
        return answer;
    }

    public void printProgression(int n) {
        System.out.print(nextValue());
        for (int j = 1; j < n; j++) {
            System.out.print(" " + nextValue());
        }
        System.out.println();
    }

    protected abstract void advance(); // no method body for abstract
}
