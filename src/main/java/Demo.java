import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(13);
        list.add(15);
        list.add(14);

        int i = CollectionUtil.findMax(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 == o2) {
                    return 0;
                } else {
                    return o1 - o2;
                }
            }
        });
        System.out.println("Max number is " + i);
    }
}