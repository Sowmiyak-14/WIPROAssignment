package wipro_Array;
import java.util.*;
public class EvenoddArrayist {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        ArrayList<Integer> list = new ArrayList<>();
	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            list.add(sc.nextInt());
	        }
	        ArrayList<Integer> evenList = new ArrayList<>();
	        ArrayList<Integer> oddList = new ArrayList<>();

	        for (int num : list) {
	            if (num % 2 == 0)
	                evenList.add(num);
	            else
	                oddList.add(num);
	        }
	        evenList.addAll(oddList);
	        System.out.println("Rearranged : " + evenList);

	}

}
