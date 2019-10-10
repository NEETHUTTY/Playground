import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int s,t,d,e;
  s=sc.nextInt();
  t=sc.nextInt();
  d=s/t;
  e=s%t;
  System.out.println("The number of students in each team is " +d+  " and left out is " +e);
  
// fill your code
}
}