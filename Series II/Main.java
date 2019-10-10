import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n,c;
        n=sc.nextInt();
        System.out.print(6+" ");
        c=11;
        System.out.print(c+" ");
        for(int i=2;i<=n-1;i++)
        {
          
         c=c+(5*i); 
          System.out.print(c+" ");
	    }
}}