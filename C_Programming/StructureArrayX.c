#include <stdio.h>

//decalration
struct hello{
    float f ;//4
    int arr[3];//12
}hobj;//16

int main (){
// printf("%lu\n",sizeof(hobj));
hobj.f=10.05;
hobj.arr[0]=1;
hobj.arr[1]=21;
hobj.arr[2]=51;

printf("%f\n",hobj.f);
printf("%d \t %d\t%d\n",hobj.arr[0],hobj.arr[1],hobj.arr[2]);

 


 return 0;
}