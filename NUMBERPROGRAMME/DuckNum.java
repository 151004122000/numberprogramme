package NUMBERPROGRAMME;

public class DuckNum {
public static void main(String[] args) {
	int sum=0,count=0;
	for(int n=1;n<=100;n++) {
			int x=n,i=0;
	while(x!=0) {
		int rem=x%10;
		if(rem==0)
			i++;
		x=x/10;
	}
	if(i!=0) {
		count++;
		sum=+i;
		System.out.println(n);
	}
}
	System.out.println("sum is"+sum);
	System.out.println("count is"+count);
  }
}
