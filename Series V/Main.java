import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      int n,a=11;
      n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
       
        int b=(int)(Math.pow(a,2));
        System.out.print(b+" ");
        a=a+4;
        //System.out.println(a);
      }
        
		// fill your code
	}
}