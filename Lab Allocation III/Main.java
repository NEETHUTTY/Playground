import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int l1,l2,l3,s,c=0;
      l1=sc.nextInt();
      l2=sc.nextInt();
      l3=sc.nextInt();
      s=sc.nextInt();
      
     if(l1>s)
     {
       c++;
       if(l2>s)
       {
         c++;
           if(l3>s)
           {
             c++;
           }   
       } 
        
     }
      System.out.println(c);
    }
}