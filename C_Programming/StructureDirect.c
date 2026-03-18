#include <stdio.h>
# pragma pack(1)

//decalration
struct demo{
    int i;//4
    char ch; //1
    float f;//4
};//9

int main (){
 struct demo dobj;
  
 printf("%lu\n",sizeof(dobj));//9
}