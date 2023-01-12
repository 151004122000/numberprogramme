package NUMBERPROGRAMME;

public class SpecialTwoDigitNum {
  public static void main(String[] args) {
	int n=59;
	int d1=n/10;
	int d2=n%10;
	int mul=d1*d2;
	int sum=d1+d2;
	int res=mul+sum;
	if(res==n) {
		System.out.println(n+"is special two digit num");
	}else {
		System.out.println(n+"is not a special two digit num");
	}
}
}
