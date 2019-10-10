import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      int a,s;
       int t1=0,t2=0,t3=1;
       System.out.printf("%d %d %d ",t1,t2,t3);
       //System.out.println(t2);
       //System.out.println(t3);
      a=sc.nextInt();
     
      for(int i=0;i<a-3;i++)
      {
      s=t1+t2+t3;
      System.out.printf("%d ",s);
        t1=t2;
        t2=t3;
        t3=s;
      }
      
    }
}