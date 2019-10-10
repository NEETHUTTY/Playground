import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int  n;
      n=sc.nextInt();
      String c=(n%2==0)?"Even":"Odd";
      System.out.println(c);
      
    }
}