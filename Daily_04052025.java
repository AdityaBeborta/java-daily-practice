import java.util.function.Predicate;

public class Daily_04052025 {
    //    program to display names starts with 'K' by using normal method and by using predicate
    public static void filterWithOutUsingPredicate(String[] arr) {
        System.out.println("The names which starts with 'K' are & filtered without using predicate : ");
        for (String s : arr) {
            if (s.startsWith("K")) {
                System.out.println(s);
            }
        }
    }

    public static void filterWithPredicate(Predicate<String> p, String[] arr) {
        System.out.println("The names which starts with 'K' are & filtered by using predicate : ");
        for (String s : arr) {
            if (p.test(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("main thread started ");
        String[] data = {"Aditya", "Pihu", "Moni", "Kiran", "Sampurna", "Keethi"};
        filterWithOutUsingPredicate(data);
        Predicate<String> pred = p -> p.startsWith("K");
        filterWithPredicate(pred, data);
    }
}
