package NUMBERPROGRAMME;

public class PerfectaNum {
  public static void main(String[] args) {
	int n=28,sum=0;
	for(int i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum+=i;
			System.out.println(i);
		}
	}
	if(sum==n)
	{
		System.out.println(n+" is perfect num");
	}else {
		System.out.println(n+" is not perfect");
	}
 }
}
