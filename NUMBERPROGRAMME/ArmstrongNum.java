package NUMBERPROGRAMME;

public class ArmstrongNum {
  public static void main(String[] args) {
	int no=1634,a=no,count=0;
	while(a!=0) {
		a=a/10;
		count++;
	}
	int b=a,rem=0;
	while(b!=0) {
		int d=b%10;
		rem=rem+(int)Math.pow(d, count);
		b=b/10;
	}
		if(no==rem) {
			System.out.println(no+" is armstrong num");
		}else {
			System.out.println(no+" is not a armstrong num");
		}
  }
}
