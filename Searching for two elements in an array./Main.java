#include<stdio.h>
int main()
{
  int arrsize,e1,e2,e3=-1;
  scanf("%d",&arrsize);
  int a[arrsize];
  for(int i=0;i<arrsize;i++)
  {
  scanf("%d",&a[i]);
  }
  scanf("%d%d",&e1,&e2);
 // printf("%d",e2);
  int c=0;
  for(int j=0;j<=arrsize;j++)
  {
    if(a[j]==e1)
     {
      printf("%d\n",j);
    //  break;
    }
    if (a[j]==e2)
    {
      c=1;
      printf("%d\n",j);
      //break;
    }
    
  
  }
  if(c==0)
     printf("-1");
}