
#include <iostream>
using namespace std;
class Base{
 protected:
     int i,j;
    public:
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
        cout<<"Inside Fun of dervied";
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
        cout<<"Inside The gun ";
      }
};

int main()
{
cout<<"Inside the main \n";
 Derived dobj;
  cout<<"Size of Base class is "<<sizeof(Base)<<"\n";// 8 byte
 cout<<"Size of dervied obj is "<<sizeof(Derived)<<"\n";// 12 bytes  8 from parent  and 4 from own 
 //cout<<dobj.i<<"\n"; // Error Inaccsible
 // cout<<dobj.j<<"\n"; // Error Inaccessible
   cout<<dobj.x<<"\n";// 0
   dobj.fun();
   dobj.gun();

   cout<<"End of the main\n";

}
