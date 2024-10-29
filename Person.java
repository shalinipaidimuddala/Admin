import java.util.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class SortByAge {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35));
        people.sort(Comparator.comparingInt(person -> person.age));
        System.out.println(people); // Output: [Bob - 25, Alice - 30, Charlie - 35]
    }
}
