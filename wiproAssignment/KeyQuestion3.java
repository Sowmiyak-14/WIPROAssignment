package wiproAssignment;

public class KeyQuestion3 {
	public static int findKey(int input1, int input2, int input3) {
		int nums[] = {input1,input2,input3};
		int minThousands = 9;
		int minHundreds = 9;
		int minTens = 9;
		int minUnits = 9;
		 for (int num : nums) {
	            int thousands = (num / 1000) % 10;
	            int hundreds = (num / 100) % 10;
	            int tens = (num / 10) % 10;
	            int units = num % 10;
	            if (thousands < minThousands) minThousands = thousands;
	            if (hundreds < minHundreds) minHundreds = hundreds;
	            if (tens < minTens) minTens = tens;
	            if (units < minUnits) minUnits = units;
	        }
	        int key = minThousands * 1000 + minHundreds * 100 + minTens * 10 + minUnits;
	        return key;
	    }
	    public static void main(String[] args) {
	        int input1 = 3521;
	        int input2 = 2452;
	        int input3 = 1352;
	        int key = findKey(input1, input2, input3);
	        System.out.println("The Key is: " + key);  	    }
	}

