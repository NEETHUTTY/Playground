import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
        int x,a,b,p;
        x=sc.nextInt();
        a=sc.nextInt();
        b=sc.nextInt();
        p=(x*a)-(x*b)-100;
      System.out.println("The profit obtained is Rs."+p);
        
        
      
	}
}