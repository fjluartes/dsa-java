// Insertion sort in Java
public class InsertionSort {
    public static void insertionSort(char[] data) {
        int n = data.length;
        for (int k = 1; k < n; k++) {
            char cur = data[k];
            int j = k;
            while (j > 0 && data[j-1] > cur) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = cur;
        }
        System.out.println(data);
    }
    
    public static void main(String[] args) {
        String str = "antidisestablishmentarianism";
        insertionSort(str.toCharArray());
    }
}
