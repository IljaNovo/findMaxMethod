import java.util.Comparator;
import java.util.List;

public class CollectionUtil {
    public static  <T> T findMax(List<? extends T> list, Comparator<? super T> comparator) {
        if (list == null || comparator == null || list.size() == 0) {
            return null;
        }
        T max = list.get(0);

        for(T item : list) {
            if (comparator.compare(max, item) < 0) {
                max = item;
            }
        }
        return max;
    }
}
