package NUMBERPROGRAMME;

public class HappyNum {
public static void main(String[] args) {
	int num=0,count=0;
	for(int n=1;n<=100;n++) {
			int x=n;
	while(x>9) {
		int sum=0;
		while(x!=0) {
			int rem=x%10;
			sum=sum+(int)Math.pow(rem, 2);
			x=x/10;
		}
		x=sum;
	}
	if(x==1) {
		count++;
		num=num+n;
		System.out.println(n);
	}
	}
	System.out.println("sum is"+num);
	System.out.println("count is"+count);
}
}
