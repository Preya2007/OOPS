import java.util.*;

public class GenericSearch {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Search 102 in roll numbers: " + searchElement(rollNumbers, 102));
        System.out.println("Search 105 in roll numbers: " + searchElement(rollNumbers, 105));

        System.out.println("Search Bob in names: " + searchElement(names, "Bob"));
        System.out.println("Search David in names: " + searchElement(names, "David"));
    }
}