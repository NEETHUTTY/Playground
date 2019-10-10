#include<stdio.h>
int main()
{
  	int n,r,c;
    scanf("%d",&n);
    int num=0;
	for(r=1;r<= n; r++) 
      {
		 for( c=1; c<=r;c++)  
           {
           num=num+1;
             if(num%2==0)
             {
			     printf("#");
             }
			  else
			     printf("*");
		   }
    	 printf("\n");
	
	  }
}