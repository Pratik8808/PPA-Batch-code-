
#include <iostream>
using namespace std;
class Base{
 public :
     int i,j;
     Base()
     {

        cout<<"Inside base Constrcutor\n";
        i=0;
        j=0;
     }
     ~Base()
     {
        cout<<"Inside base destructor\n";
     }
     void fun()
     {
        cout<<"Inside Fun of dervied\n";
     }

};
class Derived:public Base{
   public:
     int x;
     Derived()
     {
        cout<<"Inside dervied Constrcuotr\n";
        x=0;
     }
     ~Derived(){
        cout<<"Inside Dervied Destructor\n";
     }
      void gun(){
        cout<<"Inside The gun \n";
      }
};

class DerviedX:public Derived
{
 public:
     int y;
     DerviedX()
     {
        cout<<"Inside DerviedX Constructor\n";
        y=0;
     }
     ~DerviedX()
     {
        cout<<"Inside DerivedX Destructor\n";
     }
     void sun()
     {
        cout<<"Inside The sun function of the DerrivedXC class\n";

     }
};

int main()
{
cout<<"Inside the main \n";
 DerviedX dobj;
  cout<<"Size of Base class is "<<sizeof(Base)<<"\n";// 8 byte
 cout<<"Size of dervied obj is "<<sizeof(Derived)<<"\n";// 12 bytes  8 from parent  and 4 from own 
  cout<<"Size of derviedX class  is "<<sizeof(DerviedX)<<"\n";
 cout<<dobj.i<<"\n"; // 0 
  cout<<dobj.j<<"\n"; //0
   cout<<dobj.x<<"\n";// 0
      cout<<dobj.y<<"\n";// 0
   dobj.fun();
   dobj.gun();
   dobj.sun();

   cout<<"End of the main\n";

}
