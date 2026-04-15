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
   Base *bp=new Derived; // Upcasting
    bp->fun(); // Base fun () Called
    bp->gun(); // base  gun as dervied have no gun method 
    bp->sun(); // Derived Sun will called()
    // bp->run(); // Error 

    return 0;
}

//-> nexr overrdingVirtualX.cpp