import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner (System.in);
     int n;
     int a=4;
        System.out.print(a+" ");
      n=sc.nextInt();
      for(int i=1;i<n;i++)
      {
        a=a+(int)(Math.pow(i,2));
        System.out.print(a+" ");
	}
}}