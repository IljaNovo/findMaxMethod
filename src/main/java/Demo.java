import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person(12));
        list.add(new Person(13));
        list.add(new Person(14));
        list.add(new Person(15));

        PersonCompare personCompare = new PersonCompare();

        Person p = CollectionUtil.findMax(list, personCompare);
        System.out.println("Max age is " + p.getAge());
    }
}