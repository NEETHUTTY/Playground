#include<stdio.h>
#include<string.h>
int main()
{
  char str[100],rev[100];
  gets(str);
  
  int len1=strlen(str);
  int len2=strlen(rev);
  char end=len1-1;
  int begin=0;
    for(int i=end;begin<len1;begin++)
    {
      rev[begin]=str[end];
      end--;
    }
  //printf("%s",rev);
  if(strcmp(str,rev)==0)
    printf("%s is a palindrome",str);
   else
     printf("%s is not a palindrome",str);
}