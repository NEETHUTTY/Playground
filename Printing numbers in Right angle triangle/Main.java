#include<stdio.h>
int main()
{
  	int n,i,j,r,c;
    scanf("%d",&n);
    int num=1;
	for(r=1;r<=n; r++) 
      {
		 for( c=1; c<=r;c++)  
           {
			     printf("%d",num);
             }
			 num=num+1;
             printf("\n");
		   }
    	
	
	  }
