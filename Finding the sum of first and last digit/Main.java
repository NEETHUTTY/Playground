#include <stdio.h>
void main()
{
  int num,s,r;
  scanf("%d",&num);
   r=num%10;
  while (num>=10)
  {
    
   
    num=num/10;
    
  }
 
  s=num+r;

   
 printf("%d",s);

  }
