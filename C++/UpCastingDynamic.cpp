#include <iostream>
using namespace std;
 
class Base
{
    public:
      int i,j;

}; //  byte size

class Derived:public Base
{
    public:
      int x,y;
};// 16 bytes size



int main()
{
    Base *bp=NULL;
  
    bp=new Derived(); //Upcasting  (Allowed)
    
    return 0;
}