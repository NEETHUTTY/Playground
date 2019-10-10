import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,l;
      n=sc.nextInt();
      int k=n;
      int s=n*n;
      int sum=0;
    while(s!=0)
    {
      
      l=s%10;
      sum=sum+l;
      s=s/10;
      
     }
      if(sum==k)
      {
        System.out.println("Kaprekar Number");
      }
      else
        System.out.println("Not A Kaprekar Number");
        
}}