import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Daily_02052025_2 {
//create an arraylist of Integers and sort it in ascending order as well as in descending order - using Lambda expression

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(25);
        originalList.add(0);
        originalList.add(5);
        originalList.add(20);
        originalList.add(10);
        System.out.println("original list " + originalList);
        //using collections.sort for natural sorting order which is ascending by default
        Collections.sort(originalList);
        //it internally uses compareTo method
        System.out.println("Ascending order sorting - NSO " + originalList);
        //for customized sorting order we can use comparator
        Collections.sort(originalList, ((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0));
        System.out.println("Descending order sorting - DSO " + originalList);

    }
}
