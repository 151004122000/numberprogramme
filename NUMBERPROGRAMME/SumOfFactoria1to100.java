package NUMBERPROGRAMME;

public class SumOfFactoria1to100 {
	static int isfactorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
   public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=10;i++)
	{
		int ab=isfactorial(i);
		sum=sum+ab;
		System.out.println(ab);
	}
	System.out.println("sum of all factorial is: "+sum);
}
}
