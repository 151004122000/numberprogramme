package NUMBERPROGRAMME;

public class SumOfPrimenum {
  static boolean isprime(int a) {
	  int temp=0;
	  for(int i=2;i<a;i++)
	  {
		  if(a%i==0)
			  temp=temp+1;
	  }
	  if(temp==0) {
		  return true;
	  }else {
		  return false;
	  }
  }
  public static void main(String[] args) {
	  System.out.println("sum of prime nums are:");
	int sum=0;
	for(int i=2;i<100;i++)
	{
		if(isprime(i)==true) {
			sum+=i;
			System.out.println(i);
		}
	}
	System.out.println(sum);
}
}
