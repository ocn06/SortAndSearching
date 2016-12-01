import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Olivi on 08-11-2016.
 */
public class QuickSort {

    //COMPARETO
    public  <E extends Comparable<E>> void quickSort(E[] list, Integer low, Integer high) {
        if (list == null || list.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        E pivot = list[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (list[i].compareTo(pivot) < 0) {
                i++;
            }

            while (list[j].compareTo(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                E temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(list, low, j);

        if (high > i)
            quickSort(list, i, high);
    }

    //COMPARATOR
    public  <E> void quickSort(E[] list, Integer low, Integer high, Comparator<? super E> comparator) {
        if (list == null || list.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        E pivot = list[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (comparator.compare(list[i], pivot) < 0) {
                i++;
            }

            while (comparator.compare(list[j], pivot) > 0) {
                j--;
            }

            if (i <= j) {
                E temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(list, low, j);

        if (high > i)
            quickSort(list, i, high);
    }
}


