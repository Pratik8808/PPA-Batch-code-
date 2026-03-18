# include <stdio.h>


int Addition(int No1, int No2){
   int Ans=0;
   Ans=No1+No2;

   return Ans;
}
int Subtraction(int No1, int No2){
   int Ans=0;
   Ans=No1-No2;

   return Ans;
}
int main()
{
int A=11, B=10;
int result=0;
result=Addition(A,B);

printf("Addition of number is : %d\n",result);

result=Subtraction(A,B);

printf("Subtraction of number :%d\n",result);


    return 0;
}