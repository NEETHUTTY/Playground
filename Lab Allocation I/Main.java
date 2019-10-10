import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l1;
        int l2;
        int l3;
        l1=sc.nextInt();
        l2=sc.nextInt();
        l3=sc.nextInt();
        if(l1<l2)
        {
          if(l1<l3)
          {
          System.out.println("L1");
          }
          else
            System.out.println("L3");
        }
        else
          if(l2<l3)
          {
            System.out.println("L2");
          }
           else
             System.out.println("L3");
      
      
      
    }
}