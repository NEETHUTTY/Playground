import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner (System.in);
      String stu;
      stu=sc.nextLine();
      int total=0;
      int tu;
      tu=sc.nextInt();
      int bus;
      bus=sc.nextInt();
      int h;
      h=sc.nextInt();
      if(stu.compareTo("MSDS")==0)
      {
        total=tu+bus;
        //System.out.println(total);
      }
      else if(stu.compareTo("MSH")==0)
      {
        total=tu+h;
        //System.out.println(total);
      }
      else if(stu.compareTo("MGDS")==0)
      {
        total=(tu*150)/100+bus;
        //System.out.println(total);
      }
      else
         total=(tu*150)/100+h;
         //System.out.println(total);
      System.out.println(total);  
        
    }
}