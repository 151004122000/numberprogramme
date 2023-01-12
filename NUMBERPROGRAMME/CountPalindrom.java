package NUMBERPROGRAMME;

import java.util.Scanner;

public class CountPalindrom {
	static boolean ispalindrom(int x) {
		
			 int rev=0;
			 int temp=x;
			 while(x!=0)
			 {
				 int d=x%10;
				 rev=rev*10+d;
				 x=x/10;
			 }
			 if(rev==temp) {
				 return true;
			 }
			return false ;
			 
		}
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	System.out.println("enter the num:");
	 int a=sc.nextInt();
	 int count=0;
	 for(int i=100;i<a;i++) {
		 if(ispalindrom(i)==true) {
			 count++;
		 }
	 }
	 System.out.println(count);
	 sc.close();
 	}
}