import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,t1=0,t2=1,s=0;
    //  System.out.println(t1);
     // System.out.println(t2);
      n=sc.nextInt();
      for(int i=0;i<n-2;i++)
      {
       s=t1+t2;
     
        t1=t2;
        t2=s;
 
      }
          System.out.println(s);
        
        //fill your code;
    }
}