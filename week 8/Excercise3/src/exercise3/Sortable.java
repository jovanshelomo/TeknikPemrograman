package exercise3;

/**
 *
 * @author jovan
 */
abstract class Sortable {

    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        int gap = 1;
        while (gap < n / 3) {
            gap = 3 * gap + 1;
        }
        
        while (gap >= 1) {
            for (int i = gap; i < n; i++) {
                for (int j = i; j >= gap && a[j].compare(a[j - gap]) < 0; j -= gap) {
                    Sortable temp = a[j];
                    a[j] = a[j - gap];
                    a[j - gap] = temp;
                }
            }
            gap = gap / 3;
        }
    }
}