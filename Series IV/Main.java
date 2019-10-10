import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       float a=0.5f;
      float b=a+1;
      //float c=0.0f;
      System.out.print(a+" ");
       //System.out.print(b+" ");
      
      for(int i=0;i<n-1;i++)
      {
         a=a+(float)(Math.pow(3,i));
        System.out.print(a+" ");
      }
    }
}
