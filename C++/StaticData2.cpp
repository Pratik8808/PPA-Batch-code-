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

};
int demo ::k=11;

int main()
{
    demo dobj;
   
    cout<<demo::k<<"\n";  // 11
    cout<<dobj.i<<"\n"; 
    cout<<dobj.j<<"\n"; 
    cout<<sizeof(dobj)<<"\n";

    return 0;
}