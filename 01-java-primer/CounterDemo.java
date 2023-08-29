// CounterDemo for classes
class Counter {
    private int count;
    public Counter() { }
    public Counter(int initial) { count = initial; }
    public int getCount() { return count; }
    public void increment() { count++; }
    public void increment(int delta) { count += delta; }
    public void reset() { count = 0; }
}

public class CounterDemo {
    public static void main(String[] args) {
        Counter c;
        c = new Counter();
        c.increment(); // c = 1
        c.increment(3); // c = 4
        int temp = c.getCount(); // temp = 4
        c.reset(); // c = 0
        Counter d = new Counter(5); // d = 5
        d.increment(); // d = 6
        Counter e = d; // e = 6
        temp = e.getCount(); // temp = 6
        e.increment(2); // e = 8, d = 8
        System.out.println(c.getCount());
        System.out.println(d.getCount());
        System.out.println(e.getCount());
    }
}
