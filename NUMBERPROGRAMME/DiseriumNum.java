package NUMBERPROGRAMME;

public class DiseriumNum {
public static void main(String[] args) {
	int count=0,pran=0;
	for(int n=1;n<=1000;n++) {
	int p=n,rev=0,s=0,res=0,i=0,sum=0;
	while(p!=0) {
		rev=p%10;
		s=s*10+rev;
		p=p/10;
	}
	while(s!=0) {
		res=s%10;
		i++;
		sum=sum+(int) Math.pow(res, i);
		s=s/10;
	}
	if(n==sum) {
		count++;
		pran=pran+n;
		System.out.println(n);
	}
   }
	System.out.println(count);
	System.out.println("sum is"+pran);
} 
}
