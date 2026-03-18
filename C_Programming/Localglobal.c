#include <stdio.h>
int no=11;

void fun()
{
int i=51; // local variable
   printf("Inside fun","%d\n",i);//51
     // printf("Inside fun :","%d\n",no);//11
}
int main(){
     int i=21;
     printf("Inside main","%d\n",i);//21
     printf("InsidMain :","%d\n",no);//11

    

    return 0;
}