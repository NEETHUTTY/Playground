import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
      
      int n1=sc.nextInt();
     // int n2=sc.nextInt();
      //int n3=sc.nextInt();
     int r=n1%10;
     int b=n1/10;
      int h=r+b;
    
      System.out.println(h);
	}
}