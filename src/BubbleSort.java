import java.util.Comparator;

/**
 * Created by Olivi on 25-10-2016.
 */
public class BubbleSort {

    //Ex 23.1
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
/*
* In bubble sort, we basically traverse the array from first
* to array_length - 1 position and compare the element with the next one.
* Element is swapped with the next element if the next element is greater.
*
* Bubble sort steps are as follows.
*
* 1. Compare array[0] & array[1]
* 2. If array[0] > array [1] swap it.
* 3. Compare array[1] & array[2]
* 4. If array[1] > array[2] swap it.
* ...
* 5. Compare array[n-1] & array[n]
* 6. if [n-1] > array[n] then swap it.
*
* After this step we will have largest element at the last index.
*
* Repeat the same steps for array[1] to array[n-1]
*  
*/
    int n = list.length;

    for (int i = 0; i < n; i++) {
        for (int j = 1; j < (n - i); j++) {
            if (list[j - 1].compareTo(list[j]) > 0) {
                //swap the elements!
                E temp = list[j - 1];
                list[j - 1] = list[j];
                list[j] = temp;
            }
        }
    }
}

    public static <E> void bubbleSort (E[] list, Comparator<? super E> comparator) {
        int n = list.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (comparator.compare(list[j-1], list[j]) > 0) {
                    //swap the elements!
                    E temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }
    }

}
