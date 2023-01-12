package NUMBERPROGRAMME;

public class SumofArmstrong1to1000 {
  static boolean isarmstrong(int a) {
	  int count=0,i=a;
	  while(a!=0) {
		  a=a/10;
		  count++;
	  }
	int rem=0,b=i;
	while(b!=0) {
		int n=b%10;
		rem=rem+(int)Math.pow(n, count);
		b=b/10;
	}
	if(i==rem) {
		return true;
	}else {
		return false;
	}
  }
  public static void main(String[] args) {
	int sum=0;
	for(int i=1;i<=1000;i++) {
		if(isarmstrong(i)==true) {
			sum=sum+i;
			System.out.println(i);
		}
	}
	System.out.println("sum of all armstrong num is:"+sum);
}
}

