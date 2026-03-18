#include <stdio.h>

//decalration
struct hello{
    float f ;//4
    int arr[3];//12
}hobj;//16

int main (){
printf("%lu\n",sizeof(hobj));
hobj.arr[0]=1;
 


 return 0;
}