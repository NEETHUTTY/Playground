#include <stdio.h>
int main()
{
 int n1,n2,n3;
 scanf("%d%d%d",&n1,&n2,&n3);
 grt (n1,n2,n3);
}
int grt(int a,int b,int c)
{
  if(a>b)
  {
    if(a>c)
    {
      printf("%d",a);
    }
    else
      printf("%d",c);
  }
  else
  {
    if(b>c)
      printf("%d",b);
    else
       printf("%d",c);
  }
}