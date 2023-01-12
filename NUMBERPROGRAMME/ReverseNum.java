package NUMBERPROGRAMME;

public class ReverseNum {
public static void main(String[] args) {
	int a=7865;int rev=0;
	while(a!=0) {
		int d=a%10;
		rev=rev*10+d;
		a=a/10;
	}
	System.out.println(rev);
}
}
