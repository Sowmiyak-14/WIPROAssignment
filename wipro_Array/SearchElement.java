package wipro_Array;

public class SearchElement {
  public static int findIndex(int[] arr,int target) {
	  for(int i=0;i<=arr.length;i++) {
        if(arr[i]==target) {
        	return i;
        }
	  }
	  return -1;
  }
	public static void main(String[] args) {
		 int[] numbers = {1, 4, 34, 56, 7};
		 int SearchElement1=90;
		 int result1=findIndex(numbers,SearchElement1);
		 System.out.println("Index of " + SearchElement1 + ": " + result1);
		 int SearchElement2=56;
		 int result2=findIndex(numbers,SearchElement2);
		 System.out.println("Index of " + SearchElement1 + ": " + result2);
	}

}
