#include<stdio.h>
#include<string.h>
void upper();
int main()
{
  char str1[100],str2[10];
  gets(str1);
  gets(str2);
  int len1=strlen(str1);
  int len2=strlen(str2);
 
  //printf("%d",len1);
  //printf("%d",len2);
  int found,count=0;
  upper(str1);
  upper(str2);
  for(int i=0;i<=(len1-len2+1);i++)
  {
    found=1;
    //printf("%d",found);
    for(int j=0;j<len2;j++)
    {
      if(str1[i+j]!=str2[j])
      {
        found=0;
        //printf("%d",found);
      }
    }
    //printf("%d"),
    if(found==1)
    {
      count=count+1;
    }
           }
  printf("%d",count);
}
void upper(char str[])
{
  int c=0;
  while(str[c]!='\0')
  {
   if( str[c]>='a'&&str[c]<='z')
   {
     str[c]=str[c]-32;
   }
     c++;
  }
}
    