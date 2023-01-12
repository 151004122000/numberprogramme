package NUMBERPROGRAMME;

public class Armstrongnum1to1000Count {
public static void main(String[] args) {
	int num=0;int sum=0;
	for(int i=1;i<1000;i++)
	{
	 int count=0,a=i;	
		while(a!=0) {
			a=a/10;
			count++;
		}
		int b=i,rem=0;
		while(b!=0) {
			int n=b%10;
			rem=rem+(int)Math.pow(n, count);
			b=b/10;
		}
	if(i==rem) {
		num++;
		sum=sum+i;
		System.out.println(i);
	       }
	}
	System.out.println("sum is"+sum);
	System.out.println(num);
 }
}
