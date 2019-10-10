import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      
      int num1=sc.nextInt();
     int r=num1%10;
     int d=num1/100;
      int c=r+d;
      System.out.println(c);
	}
}