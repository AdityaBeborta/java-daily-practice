import java.util.Set;
import java.util.TreeSet;

public class Daily_02052025_4 {
    //add elements (integers) into TreeSet and sort it according to Descending order using Lambda expression
    public static void main(String[] args) {
        Set<Integer> originalSet = new TreeSet<>((i1, i2) -> (i1 > i2) ? -1 : i1 < i2 ? 1 : 0);
        originalSet.add(25);
        originalSet.add(0);
        originalSet.add(5);
        originalSet.add(20);
        originalSet.add(10);
        System.out.println("Sorted set ---> " + originalSet);
    }
}
