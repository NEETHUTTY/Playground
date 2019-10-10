import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      float to,b,p,l,so;
      to=sc.nextFloat();
      b=sc.nextFloat();
      so=12*b;
      p=so-to;
      l=to-so;
      if(so>to)
      {
        System.out.println("profit : Rs."+p);
      }
     else if(so<to)
     {
       System.out.printf("Loss : Rs.%.2f",l);
     }
     else
       System.out.println("No profit nor loss");
    }
} //fill your code;
    
