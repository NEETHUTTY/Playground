import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int by,cy,a;
       by=sc.nextInt();
       cy=sc.nextInt();
       if(cy>by)
       {
         a=cy-by;
       }
       else
         a=(100-by)+cy;
         System.out.println(a);

         
    }
}