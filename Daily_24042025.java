import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Daily_24042025 {
    /*Given a list of integers, use Java 8 streams to calculate the sum of all even numbers in the list.*/

    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(15, 45, 88, 9, 6, 4, 2, 4, 6, 3, 7, 22, 36, 45, 85, 96, 45, 11, 12, 13, 14, 15, 1622, 22);
        System.out.println("original list "+ listOfNumbers);
        List<Integer> evenArrayList = listOfNumbers.stream().filter(currentNumber -> (currentNumber % 2 == 0)).collect(Collectors.toList());
        System.out.println("even list "+evenArrayList);
        int sumOfEvenNumbers = evenArrayList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum of even numbers are "+sumOfEvenNumbers);

    }
}
