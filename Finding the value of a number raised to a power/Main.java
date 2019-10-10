import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      //System.out.println(e);
      int r=1,i=0;
      while(e!=0)
      {
           
        r=r*b;
        e--;
      }
      System.out.println(r);
      
  
    }
}