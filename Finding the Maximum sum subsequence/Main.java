#include <stdio.h>
int main()
{
  int N;
  scanf("%d",&N);
  int a[N];
  for(int i=0;i<N;i++)
  {
    scanf("%d",&a[i]);
  }
  printf("%d",sum( a, N ) );
  return 0;
}
int sum(int a[],int n)
{
  int rs,ms;
  rs=a[0];
  ms=a[0];
  for(int i=1;i<n;i++)
  {
    if(a[i]>a[i-1])
    {
      rs=rs+a[i];
    }
    else
    {
        rs=a[i];
    }
    if(rs>ms)
    {
      ms=rs;
    }
  }
    return ms;
  }