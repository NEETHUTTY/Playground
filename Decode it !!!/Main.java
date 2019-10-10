#include <stdio.h>
#include<string.h>
int main()
{
  char str[100],c;
  scanf("%[^\n]s",str);
  int key,n,i;
  int len=strlen(str);
  scanf("%d",&key);
  key=key%26;

  for(int i=0;str[i]!='\0';i++)
  {
   c=str[i];
  if(c>='a'&&c<='z')
  {
    c=c-key;
    if(c < 'a')
            {
                c = c + 'z' - 'a' + 1;
            }
  }
  else if (c>='A'&&c<='Z')
  {
    c=c-key;
     if(c < 'A')
            {
                c = c + 'Z' - 'A' + 1;
     }
  }
    str[i]=c;
    
  }
  printf("%s", str);
}
