package NUMBERPROGRAMME;
public class Primenumbet1to100Count {
  public static void main(String[] args) {
	  int count=0;
	for(int i=1;i<=100;i++)
	{
		int temp=0;
		for(int j=2;j<=i-1;j++)
		{
			if(i%j==0)
				temp=temp+1;
			
		}
	  if(temp==0)
	   {
		  count++;
		  System.out.println(i);
		  
	   }
    }
	System.out.println("no of prime num is "+count);
  }
}
