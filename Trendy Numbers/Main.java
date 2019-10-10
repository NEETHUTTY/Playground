import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      
       int n,r;
       n=sc.nextInt();
      if(n<100)
      {
         System.out.println("Not a Trendy Number");
      }
      while(n>=100&&n<=999)
      {
       n=n/10;
       r=n%10;
       if(r%3==0)
       {
        System.out.println("Trendy Number");
       }
       else
         System.out.println("Not a Trendy Number");
        }

    }}