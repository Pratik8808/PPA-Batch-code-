#include <stdio.h>

//decalration
struct demo{
    int i;//4
    char ch; //1
    float f;//4
};//12

int main (){
 struct demo dobj;
  
 printf("%lu\n",sizeof(dobj));
}