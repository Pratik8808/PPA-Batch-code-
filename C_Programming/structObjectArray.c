#include <stdio.h>

//decalration
struct demo{
    int i;
    float f;

};

int main (){
// printf("%lu\n",sizeof(hobj));
struct demo arr[4];

arr[0].i=11;
arr[0].f=11.05f;

arr[1].i=21;
arr[1].f=21.05f;

arr[2].i=31;
arr[2].f=31.05f;

arr[3].i=41;
arr[3].f=41.05f;

printf("%d\n",arr[2].i);//31;
printf("%f\n",arr[3].f);

printf("%lu",sizeof(arr));
 return 0;
}