import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,r,o=0,e=0;
      n=sc.nextInt();
      while(n!=0)
      {
        r=n%10;
        if(r%2==1)
        {
          o=o+r;
        }
        else
          e=e+r;
        n=n/10;
      }
      if(o==e)
      {
        System.out.println("yes");
      }
      else
         System.out.println("No");
        
        //fill the code;
    }
}