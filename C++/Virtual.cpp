#include <iostream>
using namespace std;


class Base
{
    public:
      int i,j;
      int add(int a, int b)//1000
      {
        return a+b;
      }
      virtual int sub(int a,int b)=0;
};

class Derived:public Base
{
    public:
     int x,y;
     int mult (int a,int b)//2000
     {
        return a *b;
     }
     int sub(int a, int b) //3000
     {
        return a-b;
     }
};

int main()
{
   Base *ptr=new Derived ;
  int ans= ptr->sub(5,2);
  cout<<sizeof(Derived)<<endl;
  cout<<sizeof(Base)<<endl;
   cout<<"This result"<<ans<<"\n";


}