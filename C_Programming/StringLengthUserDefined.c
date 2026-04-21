#include <stdio.h>
#include <string.h>


// Called by adderess
int strLenX(char *ptr)
{
        int i=0;

        while(*ptr !='\0')
        {
            i++;
            ptr++;
        }
        return i;

}
int main()
{
    char str[]="Ganesh";  //100
    int ret=0;
    ret=strLenX(str); //strLenX(100)
  printf("string length is %d\n",ret);
   
  
    return 0;

}