import java.util.function.Predicate;

public class Daily_03052025 {
    //write a predicate to check if the given integer is greater than 10 or not using lambda expression
    public static void main(String[] args) {
        Predicate<Integer> p = i -> i > 10;
        System.out.println(p.test(1));
        System.out.println(p.test(11));
        System.out.println(p.test(1212));
        //System.out.println(p.test("aditya")); CE : incompatible types: java.lang.String cannot be converted to java.lang.Integer
    }
}
