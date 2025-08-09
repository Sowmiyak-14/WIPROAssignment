package wipro_Array;
import java.util.*;
public class DuplicateElementsRemove {

	public static void main(String[] args) {
        Integer[] array= {1,2,3,4,4,5,1};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(array));
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> uniqueList = new ArrayList<>(set);
        System.out.println("originalList: " +list);
        System.out.println("uniqueList: " +uniqueList);

	}

}
