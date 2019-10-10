import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      int a,f=1,flag=0;
      a=sc.nextInt();
      for(int i=1;i<=a/2;i++)
      {
        f=f*i;
        if(f==a)
        {
          flag=1;
        }
      }
      if(flag==1)
      {
       System.out.println("Yes"); 
      } 
      else
         System.out.println("No"); 
        
}}
