package core2;
import java.util.*;

public class GenericListMerger {
  
    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size(), size2 = list2.size();
        int minSize = Math.min(size1, size2);

    
        for (int i = 0; i < minSize; i++) {
            mergedList.add(list1.get(i));
            mergedList.add(list2.get(i));
        }

        
        if (size1 > size2) {
            mergedList.addAll(list1.subList(minSize, size1));
        } else if (size2 > size1) {
            mergedList.addAll(list2.subList(minSize, size2));
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6);

        List<Integer> mergedList = mergeAlternating(list1, list2);
        System.out.println("Merged List: " + mergedList);
    }
}
