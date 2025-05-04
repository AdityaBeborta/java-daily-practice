import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Daily_04052025_2 {
    //    write a predicate to remove null and empty values from the given String array
    public static void removeNullAndEmptyValuesFromTheArray(Predicate<String> p, String[] arr) {
        //    create a list to hold the not null and empty values
        List<String> finalList = new ArrayList<>();
        for (String names : arr) {
            if (p.test(names)) {
                finalList.add(names);
            }
        }
        System.out.println("The list of valid Strings are : " + finalList);
    }

    public static void main(String[] args) {
        String[] arr = {"Aditya", "", null, "Bapun", null, ""};
        Predicate<String> p = s -> s != null && !s.isEmpty();
        removeNullAndEmptyValuesFromTheArray(p, arr);
    }
}
