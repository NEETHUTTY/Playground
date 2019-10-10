#include<stdio.h>
int main()
{
  int arrsize,sum1=0,sum2=0;
  scanf("%d",&arrsize);
  int a[arrsize];
  for(int i=1;i<=arrsize;i++)
  {
  scanf("%d",&a[i]);
  }
  for(int i=1;i<=(arrsize/2);i++)
  {
    sum1=sum1+a[i];
  }
   for(int i=arrsize/2+1;i<=arrsize;i++)
  {
    sum2=sum2+a[i];
    //printf("%d\n",a[i]);
  }
   //printf("%d\n",sum2);
  if(sum1==sum2)
  { 
    printf("Perfect Batch");
  }
  else
    printf("Not a Perfect Batch");
}