import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        int n,r,s=0;
        n=sc.nextInt();
      while(n!=0)
      {
        r=n%10;
        s=s+r;
        n=n/10;
	}
      System.out.println("Alice must go in path-"+s);
}
}