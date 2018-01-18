package basics;

public class Assignment01 {

	public static void main(String[] args) {
		int x = 4;
		System.out.println(SumOfNumbers(x));
		System.out.println(Factorial(x));
		
		int[] ArrayOfNumbers = {5,4,3};
		System.out.println("The minumum of the array is: " +  MinimumOnArray(ArrayOfNumbers));
		System.out.println("The average of the array is: " +  AverageOnArray(ArrayOfNumbers));
		System.out.println("The maximum of the array is: " +  MaximumOnArray(ArrayOfNumbers));

	}
	
	private static int Factorial(int n) {
		if (n == 0) {
			return 1;
		}
		else if (n == 1) {
			return 1;
		}
		
		return n*Factorial(n-1);
	}	
	private static int SumOfNumbers(int n) {
		if (n == 0) {
			return 0;
		}
		return n + SumOfNumbers(n-1);
	}
	
	private static int MinimumOnArray(int[] theArray) {
		int theminimum = theArray[0];
		for (int i : theArray) {
			if(i < theminimum) {
				theminimum = i;
			}
		}
		return theminimum;
	}
	private static int AverageOnArray(int[] theArray) {
		int thesum = 0;
		for (int i : theArray) {
				thesum = thesum + i;
		}
		return thesum/(theArray.length);
	}
	private static int MaximumOnArray(int[] theArray) {
		int themax = theArray[0];
		for (int i : theArray) {
			if(i > themax) {
				themax = i;
			}
		}
		return themax;
	}
}
