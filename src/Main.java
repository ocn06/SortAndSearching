import java.util.Arrays;

/**
 * Created by Olivi on 25-10-2016.
 */
public class Main {
    protected static Integer[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};


    public static void main(String[] args) {

        //BubbleSort
        //Når det er generics kan man ikke bruge primitive datatyper
        BubbleSort bS = new BubbleSort();
        bS.bubbleSort(list);
        System.out.println(Arrays.toString(list));


        //MergeSort
        MergeSort mS = new MergeSort();
        mS.mergeSort(list);
        System.out.println(Arrays.toString(list));

        //QuickSort
        QuickSort qS = new QuickSort();
        qS.quickSort(list, 0, list.length - 1);
        System.out.println(Arrays.toString(list));

    }
}
