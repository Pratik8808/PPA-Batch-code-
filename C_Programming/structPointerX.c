#include <stdio.h>

//decalration
struct demo{
    int i ;//4
    int *ptr;//8
};//12 but padding given 16;

int main (){
    struct demo dobj;
    
int no=21;

dobj.i=11;
dobj.ptr=&no;

printf("%d\n",dobj.i);
printf("%d\n",*(dobj.ptr));


 


 return 0;
}