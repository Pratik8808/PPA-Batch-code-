#include <stdio.h>

//decalration
struct demo{
    int i ;//4
    int *ptr;//8
};//12 but padding given 16;

int main (){
    struct demo dobj;
    

printf("Size pf object: %lu\n",sizeof(dobj));//12 or 16 depend on complier

 


 return 0;
}