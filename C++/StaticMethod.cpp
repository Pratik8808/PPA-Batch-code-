#include <iostream>
using namespace std;

class demo
{
    public:
      int  i;  //non static
      int j;   // non static
      static int  k;  //static

      demo(){
        this-> i=0;
        this->j=0;
      }
      void fun() // Non static Method
      {
        cout<<"Inside non static Fun"<<"\n";
        cout<<"i:"<<i<<"\n";
        cout<<"j:"<<j<<"\n";
        cout<<"k:"<<k<<"\n";
      }

      static void gun() // Static Method 
      {
        cout<<"Inside static gun"<<"\n";
        // cout<<"i:"<<i<<"\n";
        // cout<<"j:"<<j<<"\n";
        cout<<"k:"<<k<<"\n";  
      }



};
int demo ::k=11;

int main()
{     
    cout<<demo::k<<"\n";  // 11
    demo::gun();
    demo dobj;
   
  
    cout<<dobj.i<<"\n"; 
    cout<<dobj.j<<"\n"; 
    dobj.fun();

    return 0;
}