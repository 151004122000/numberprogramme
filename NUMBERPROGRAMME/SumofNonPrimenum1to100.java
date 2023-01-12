package NUMBERPROGRAMME;

public class SumofNonPrimenum1to100 {
	static boolean isnonprime(int a) {
		int count=0;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				count++;
			}
		}
		if(count==0) {
			return false;
		}
		return true ;
	}
 public static void main(String[] args) {
	System.out.println("sum of non prime nums are:");
	int sum=0;
	for(int i=2;i<=100;i++) {
		if(isnonprime(i)==true) {
			sum=sum+i;
			System.out.println(i);
		}
	}
	System.out.println(sum);
}
}
