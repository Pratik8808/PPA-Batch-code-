#include <iostream>
using namespace std;


class Hello
{

   public: 
        void fun();
        void gun();
};
class Demo
{
   public:int i;
   private : int j;
   protected : int k;

   public:
   Demo()
   {
    i=11;
    j=21;
    k=51;
   }
   friend class Hello;5
  
};

void Hello::fun()// fun belong to Class hello
{
Demo dobj;
cout<<dobj.i<<endl;
cout<<dobj.j<<endl;
cout<<dobj.k<<endl;

}

void Hello ::gun ()// Gun belong to Class he;;p
{
Demo dobj;
cout<<dobj.i<<endl;
cout<<dobj.j<<endl;
cout<<dobj.k<<endl;

}


int main()
{
    Hello hobj;

    hobj.gun();
    hobj.fun();
    
    

    return  0;
}

// FriendDemoClassXX.cpp 