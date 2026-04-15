#include <iostream>
using namespace std;
 
class Base
{
    public:
      int i,j;

      void fun()
      {cout<<"Inside Base fun \n"; }

       virtual void gun()
      {cout<<"Inside Base gun \n"; }

      virtual void sun()
      {cout<<"Inside Base sun \n"; }
      

}; //  byte size

class Derived:public Base
{
    public:
      int x,y;
      
      void fun()
      {cout<<"Inside Derived Fun\n";}  /// Redefination

      void sun()
      {cout<<"Inside Derived Sun\n";}

    virtual void run()
      {cout<<"Inside Derived run\n";}
};// 16 bytes size



int main()
{
    cout<<sizeof(Base)<<"\n";//8 bytes
    cout<<sizeof(Derived)<<"\n";//16 bytes
 
    

    return 0;
}