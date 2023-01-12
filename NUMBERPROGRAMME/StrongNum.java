package NUMBERPROGRAMME;

public class StrongNum {
public static void main(String[] args) {
	int num=0,count=0;
	for(int n=1;n<=1000;n++) {
	int a=n,sum=0;
	while(a!=0) {
		int d=a%10;int fact=1;
		for(int i=1;i<=d;i++) {
		fact=fact*i;
		}
		a=a/10;
		sum=sum+fact;
	}
	if(n==sum) {
		num++;
		count=count+n;
		System.out.println(n+"strong num");
	}
  }
	System.out.println(num);
	System.out.println("sum is"+count);
}
}