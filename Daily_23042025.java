import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Daily_23042025 {
    public static void main(String[] args) {
        /*
        * write a programme which will filter the numbers which are greater than 30 and collect it in a list
        * */
        List<Integer> numbers = Arrays.asList(5,1,3,55,0,32,33,63,96);
        List<Integer> filteredData = numbers.stream().filter(num -> num >= 30).collect(Collectors.toList());
        System.out.println("original data "+numbers);
        System.out.println("filtered data "+filteredData);

    }
}
