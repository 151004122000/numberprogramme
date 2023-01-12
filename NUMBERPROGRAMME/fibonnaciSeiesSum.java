package NUMBERPROGRAMME;

public class fibonnaciSeiesSum {
	public static void main(String[] args) {
   int a=0;
   int b=1;
   int c=0;
   int count=0;
   for(int i=1;i<=20;i++) {
	   c=a+b;
	   count=count+c;
	   System.out.println(c+" ");
	   a=b;
	   b=c;
     }
   System.out.println("sum of fibonnaci series is"+count);
   }
}
