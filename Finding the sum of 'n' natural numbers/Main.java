#include <stdio.h>
int fact(int n);
int main()
{
  int n;
  scanf("%d",&n);
  printf("%d",sum(n));
}
int sum(int n)
{
  if(n>=1)
  {
    return (n*(n+1)/2);
  }
  else
    return 1;
}