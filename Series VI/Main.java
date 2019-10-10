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
          if(i%2==1)
          {
          int b=(i*i)-1;
          System.out.print(b+" ");
	    }
        else{
            int c=(i*i)-2;
           System.out.print(c+" ");}
          
}}}