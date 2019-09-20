package compare;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class ComparatorObject {
    public static void main(String[] args) {
        List<Person> personList = Person.getPersons();
        //Test git add commit

        personList.sort(Comparator.comparing(Person::getDob));
        FunctionUtil.forEach(personList,System.out::println);

        System.out.println(" ");
        Comparator<Person> personComparator = Comparator.comparing(Person::getFirstName)
                                                    .thenComparing(Person::getLastName)
                                                    .thenComparing(Person::getDob);
        personList.sort(personComparator);
        FunctionUtil.forEach(personList,System.out::println);
        System.out.println("Add");
    }
}
