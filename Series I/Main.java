import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
          b=i*i;
          System.out.print(b+" ");
	    }
}}