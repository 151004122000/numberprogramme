package NUMBERPROGRAMME;

public class SumOfPalindrom1to100 {
  static boolean ispalindrom(int a) {
	  int rev=0,temp=a;
	  for(int i=0;i<a;i++)
	  {
		  while(a!=0)
		  {
			  int d=a%10;
			  rev= rev*10+d;
			  a=a/10;
		  }
	  }
	  if(rev==temp) {
		  return true;
	  }else {
		  return false;
	  }
  }
  public static void main(String[] args) {
	System.out.println("sum of palindrom nums are:");
	int sum=0;
	for(int i=0;i<100;i++) {
		if(ispalindrom(i)==true) {
			sum+=i;
			System.out.println(i);
		}
	}
	System.out.println(sum);
  }
}
