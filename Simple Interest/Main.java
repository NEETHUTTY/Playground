import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int p,n;
      float i,r;
      p=sc.nextInt();
      n=sc.nextInt();
      r=sc.nextFloat();
      
      i=p*n*r/100;
      System.out.printf("%.2f",i);
      
    }
}