import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Olivi on 25-10-2016.
 */
public class MergeSort {

    //COMPARETO
    /** The method for sorting the numbers */
    public static <E extends Comparable<E>> void mergeSort(E[] list) {
        if (list.length > 1) {
            // Merge sort the first half
            E[] firstHalf = (E[]) new Integer[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            Integer secondHalfLength = list.length - list.length / 2;
            E[] secondHalf = (E[]) new Integer[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }

    /** Merge two sorted lists */
    public static <E extends Comparable<E>> void merge(E[] list1, E[] list2, E[] temp) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if ((list1[current1].compareTo(list2[current2]) < 0))
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }


    //COMPARATOR
    public static <E> void mergeSort(E[] list,Comparator<? super E> comparator) {
        if (list.length > 1) {
            // Merge sort the first half
            E[] firstHalf = (E[]) new Integer[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Merge sort the second half
            Integer secondHalfLength = list.length - list.length / 2;
            E[] secondHalf = (E[]) new Integer[secondHalfLength];
            System.arraycopy(list, list.length / 2,
                    secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge firstHalf with secondHalf into list
            merge(firstHalf, secondHalf, list);
        }
    }

    /** Merge two sorted lists */
    public static <E> void merge(E[] list1, E[] list2, E[] temp, Comparator<? super E> comparator) {
        int current1 = 0; // Current index in list1
        int current2 = 0; // Current index in list2
        int current3 = 0; // Current index in temp

        while (current1 < list1.length && current2 < list2.length) {
            if (comparator.compare(list1[current1], list2[current2]) < 0)
                temp[current3++] = list1[current1++];
            else
                temp[current3++] = list2[current2++];
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }
}
