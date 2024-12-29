package java8;

public class InterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		amstrongNumber();
		fibonnaciSeries();
		reverseString("Practice Programming");
		palindrome(343);
		missingNumArray();

	}
private static void missingNumArray() {
		int arr[] = {3,4,5,6,8,9,10};
		int n = arr.length +1; //+1 adding missing element
		int sum = (n*(n+1))/2;
		int sumOfElements = 0;
		
		for(int i : arr) {
			sumOfElements = sumOfElements + arr[i];
		}
		int missingNum = sum-sumOfElements;
		System.out.println("missing element : "+missingNum);
		
	}
private static void palindrome(int num) { // reverse of number should be same
		int temp =num, sum =0;
		while(temp>0) {
			int r = temp % 10;
			 sum = (sum * 10) + r;
			 temp = temp / 10;
		}
		if(sum == num)
			System.out.println(num+" is a palindrome number");
		else
			System.out.println(num+" is not a palindrome number");
	}
private static void reverseString(String actual) {
	
	   int length = actual.length();
	   String reverse = "";
	   for(int i = length-1;i>=0;i--) {
		   reverse = reverse + actual.charAt(i);
	   }
	   System.out.println();
		System.out.println("String reverse : "+reverse);
	}
private static void amstrongNumber() { // sum of cubes of its digits 
	   int num= 371;   // 1,2,3,4,5,6,7,8,9,153,371,407,1634,8208
	   int temp = num;
	   int sum = 0;
	   int numLength = (num+"").length();
	   while(temp>0) {
		   int r = temp % 10;
		   sum = (int) (sum + Math.pow(r, numLength));
		   //sum = sum +(r*r*r);
		   temp = temp/10;
	   }
	   if(sum == num)
		   System.out.println(num +" is an Amstrong number");
	   else
		   System.out.println(num +" is not an Amstrong number");
   }
private static void fibonnaciSeries() { // 0,1,1,2,3,5,8,13,21,34
	   
	   int n1=0 , n2=1, n3;
	   int x=20;
	   System.out.print("Fibonnaci Series 20 numbers: "+n1+" "+n2);
	   for(int i=2;i<x;i++) {
		   n3=n1+n2;
		   System.out.print(" "+n3);
		   n1=n2;
		   n2=n3;
	   }
	   
   }
}
