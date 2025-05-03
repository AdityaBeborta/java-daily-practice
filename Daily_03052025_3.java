import java.util.function.Predicate;

public class Daily_03052025_3 {
    public static void passTheValues(Predicate<Integer> p, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (p.test(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {0, 5, 10, 15, 20, 25, 30, 35, 40};
//      and() or() and negate() are the default methods which are present inside functional interface Predicate

//        predicate to test if the number is greater than 10 or not
        Predicate<Integer> p1 = i -> i > 10;
//        predicate to test if the number is even or not
        Predicate<Integer> p2 = i -> i % 2 == 0;
//        calling predicate 1 or applying predicate 1 p1
        passTheValues(p1, arr);
//        calling predicate 2 or applying predicate 2 p2
        passTheValues(p2, arr);
//        check those number which are less than 10
        passTheValues(p1.negate(), arr);
//        check those numbers which are greater than 10 and which are even
        passTheValues(p1.and(p2), arr);
//        check those numbers which are greater than 10 or which are even
        passTheValues(p1.or(p2), arr);


    }
}
