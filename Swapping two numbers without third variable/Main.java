import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int a;
      int b;
      a=sc.nextInt();
       b=sc.nextInt();            
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println(+a);
       System.out.println(+b);
    }
}