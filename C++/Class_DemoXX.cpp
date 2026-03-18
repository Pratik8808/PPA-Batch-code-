# include <iostream>
using namespace std;

class demo
{
    public:
        int i;//characteristics
        int f;//Characteristics

        void fun() //Behaviour (function)
        {
            cout<<"Inside the fun";
        }
};

 int main()
 {
  demo obj;
  cout<<obj.i<<"\n";
   obj.fun(); 

    return 0;
 }
