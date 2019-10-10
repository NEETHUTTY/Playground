#include<stdio.h>
int main()
{
  int arrsize,max,i,j;
  scanf("%d",&arrsize);
  int a[arrsize];
  for(int i=0;i<arrsize;i++)
  {
  scanf("%d",&a[i]);
  }
  max=a[0];
  //printf("%d\n",max);
  for(int i=0;i<=arrsize-1;i++)
  {
    if(max<a[i])
     {
      max=a[i];
     }
  }
    printf("%d ",max);
  return 0;
}