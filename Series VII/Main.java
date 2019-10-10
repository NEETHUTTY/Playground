import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a=1;
         float b=2.0f,c=1.0f;
         System.out.print(a+" ");
         System.out.print(b+" ");
         int flag=0;
         for(int i=0;i<(n/2)-1;i++)
         {
          c=c*3;
          b=b*3;
          System.out.printf("%.1f %.1f ",c ,b); 
          
}}}