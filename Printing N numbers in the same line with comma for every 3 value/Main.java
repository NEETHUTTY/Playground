#include <stdio.h>
int main() {
  int i,a;
  scanf("%d",&a);
  for(i=1;i<=a;i++)
  {
    printf("%d",i);
    if(i%3==0)
    {
      printf(",");
    }
  }
	//Type your code
	return 0;
}