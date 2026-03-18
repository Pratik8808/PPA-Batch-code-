#include <stdio.h>

//decalration
struct demo{
    int i;//4
    char ch; //1
    float f;//4
};//8

int main (){
 struct demo dobj;
 struct demo *ptr=NULL;
ptr=&dobj;


 dobj.i=11;
 dobj.ch='A';
 dobj.f=10.0f; // 
 
 ptr->i=11;
 ptr->ch='B';
 ptr->f=11.05;

 printf("%d\n",ptr->i);
 printf("%ch\n",ptr->ch);
 printf("%f",ptr->f);

 


 return 0;
}