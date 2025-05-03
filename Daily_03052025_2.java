import java.util.function.Predicate;

public class Daily_03052025_2 {
    //Write a predicate to check the length of given string is greater than 3 or not.
    public static void main(String[] args) {
        Predicate<String> p = s -> s.length() > 3;
        System.out.println(p.test("A"));
        System.out.println(p.test("AD"));
        System.out.println(p.test("ADI"));
        System.out.println(p.test("ADIT"));
        System.out.println(p.test("ADITY"));
        System.out.println(p.test("ADITYA"));
    }
}
