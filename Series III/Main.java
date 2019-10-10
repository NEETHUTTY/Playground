import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
       
        for(int i=1;i<=n;i++)
        {
          int b=(int)(Math.pow(3,i));
          System.out.print(b+" ");
	    }
}}