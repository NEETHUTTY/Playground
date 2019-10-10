#include <stdio.h>
int main()
{
  int r1,c1,r2,c2;
  scanf("%d%d",&r1,&c1);
  c2=r1;
  r2=c1;
  int a[r1][c1],b[r2][c2];
  for(int i=0;i<r1;i++)
  {
    for(int j=0;j<c1;j++)
    {
      scanf("%d ",&a[i][j]);
    }
  }
  for(int i=0;i<r2;i++)
  {
    for(int j=0;j<c2;j++)
    {
     b[i][j]=a[j][i];
    }
  }
  for(int i=0;i<r2;i++)
  {
    for(int j=0;j<c2;j++)
    {
     printf("%d ",b[i][j]);
    }
     printf("\n");
}
}