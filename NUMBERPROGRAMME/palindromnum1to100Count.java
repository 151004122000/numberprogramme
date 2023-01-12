package NUMBERPROGRAMME;

public class palindromnum1to100Count {
 public static void main(String[] args) {
	int count=0;
	for(int i=1;i<100;i++)
	{
		int temp=i;
		int rev=0;
		while(temp!=0) {
			int d=temp%10;
			rev=rev*10+d;
			temp=temp/10;
		}
		if(rev==i) {
			count++;
			System.out.println(i);
		}
	}
	
	System.out.println("num of palindrom is "+count);
 }
}
