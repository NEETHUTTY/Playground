import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in); 
      int n=sc.nextInt();
      int b,c=0,d=0;
      for(int i=0;i<n;i++)
      {
        b=sc.nextInt();
        if(b>0)
        {
          c++;
          //v++;
        }
        else
          d++;
          //v++;
      }
      System.out.println("Number of positive numbers is "+c+" and the number of negative numbers is "+d);
}}