import java.util.Comparator;

public class PersonCompare implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            return o1.getAge() - o2.getAge();
        }
    }
}
