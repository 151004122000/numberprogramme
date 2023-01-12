package NUMBERPROGRAMME;

public class PalindromNum {
public static void main(String[] args) {
	int a=123,rev=0,temp=a;
	while(temp!=0)
	{
		int d=temp%10;
		rev =rev*10+d;
		temp=temp/10;
	}
	if(temp==rev) {
		System.out.println(a+" is a palindrom num");
	}else {
		System.out.println(a+" is not a palindrom num");
	}
}
}
