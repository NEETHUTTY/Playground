import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
      int n;
      float m=0.0f;
      int c=0;
      do
      {
        n=sc.nextInt();
        if(n<0)
        {
          m=(float)(m-1.0);
         // c++;
        }
        else  if(n%2!=0)
         {
          m++;
          c++;
         }
          else
          {
          m=(float)(m-0.5);
            //c++;
          }
        }while(n>0&&c!=3);
       
      System.out.printf("%.1f",m);
    }
}