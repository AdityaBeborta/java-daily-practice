import java.util.Set;
import java.util.TreeSet;

public class Daily_02052025_3 {
    public static void main(String[] args) {
        //create a TreeSet of integers and check if it is getting sorted
        Set<Integer> originalSet = new TreeSet<>();
        originalSet.add(25);
        originalSet.add(0);
        originalSet.add(5);
        originalSet.add(20);
        originalSet.add(10);
        System.out.println("Original set ---> "+originalSet);
    }
}
