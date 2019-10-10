import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int a,b,n,r1=0,r2=0,i;
      a=sc.nextInt();
      b=sc.nextInt();
      if((a>=10&&a<=99)&&(b>=10&&b<=99))
      {
        for( i=a;i<=b;i++)
        {
         int j=i;
        r1=i/10;
        r2=i%10;
        if(((r1+r2)+(r1*r2))==j)
        {
          System.out.println(i);
        }
        }}
      
        //fill the code;
    
  }}