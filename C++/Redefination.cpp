#include <iostream>
using namespace std;
 
class Base
{
    public:
      int i,j;

      void fun()
      {cout<<"Inside Base fun \n"; }

        void gun()
      {cout<<"Inside Base gun \n"; }

        void sun()
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

      void run()
      {cout<<"Inside Derived run\n";}
};// 16 bytes size



int main()
{
    Base *bp=NULL;
  
    bp=new Derived(); //Upcasting  (Allowed)
    bp->fun(); // Base fun will called  because pointer is of base
    bp->gun();// Base gun
    bp->sun();// Base Sun will called  because pointer is of base
    // bp->run(); // Error


    return 0;
}