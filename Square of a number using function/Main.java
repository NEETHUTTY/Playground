#include<stdio.h>
int sum(n)
{
  int s=(n*n);
  return s;
}
int main() {
   int n;
   scanf("%d",&n);
   int s= sum(n);
   printf("%d",s);
  //return 0;
}

