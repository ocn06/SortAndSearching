import java.util.Comparator;

/**
 * Created by Olivi on 25-10-2016.
 */
public class IntComparator implements Comparator <Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
