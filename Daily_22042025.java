import java.util.Arrays;
import java.util.List;

public class Daily_22042025
{
    public static void main(String[] args) {
        /*Challenge 1: Count Names Starting with a Specific Letter
        You have a list of names. Write a lambda expression using Stream API to count how many names start with the letter 'A' (case-insensitive).
        List<String> names = Arrays.asList("Ankit", "Amit", "John", "alice", "Bob", "Alex");*/
        List<String> names = Arrays.asList("Ankit", "Amit", "John", "alice", "Bob", "Alex");
        long count = names.stream().filter(currentName -> currentName.toUpperCase().startsWith("A")).count();
        System.out.println(count);

    }
}
