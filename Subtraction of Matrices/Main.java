#include<stdio.h>
int main()
{
  int r1,c1,r2,c2;
  scanf("%d%d",&r1,&c1);
  r2=r1;
  c2=c1;
  int a[r1][c1],b[r2][c2],c[r1][c1];
  for(int i=0;i<r1;i++)
  {
    for(int j=0;j<c1;j++)
    {
      scanf("%d",&a[i][j]);
    }
  } 
  for(int i=0;i<r2;i++)
  {
    for(int j=0;j<c2;j++)
    {
      scanf("%d",&b[i][j]);
    }
  }
  for(int i=0;i<r1;i++)
  {
    for(int j=0;j<c1;j++)
    {
      c[i][j]=a[i][j]-b[i][j];
    }
  }
  for(int i=0;i<r1;i++)
  {
    for(int j=0;j<c1;j++)
    {
      printf("%d ",c[i][j]);
    }
    printf("\n");
  }
 
}