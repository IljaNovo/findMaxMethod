import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionUtilTest {
    public class Comp implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 == o2) {
                return 0;
            } else {
                return o1 - o2;
            }
        }
    }

    @Test
    public void testListIsNull() throws Exception {
        List<Integer> list = null;
        Assert.assertEquals(CollectionUtil.findMax(list, new Comp()),null);
    }

    @Test
    public void testComparableIsNull() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        Assert.assertEquals(CollectionUtil.findMax(list, null),null);
    }

    @Test
    public void testListIsEmpty() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        Assert.assertEquals(CollectionUtil.findMax(list, new Comp()),null);
    }

    @Test
    public void testExecutionFindMax() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(-1);
        Assert.assertEquals(CollectionUtil.findMax(list, new Comp()), new Integer(5));
    }
}