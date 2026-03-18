# include <iostream>
using namespace std;

class demo
{
    public:
        int i;//characteristics
        int f;//Characteristics

        demo()//Constructor
        { cout<<"Inside the object";
            i=0;
            f=0.0f;
        }
        ~demo(){         //Destructor
            cout<<"Inside Destructor";
        }
        void fun() //Behaviour (function)
        {
            cout<<"Inside the fun";
        }
};

 int main()
 {
    cout<<"Inside Main\n";
  demo obj;//Objecct
  cout<<"\n"<<obj.i<<"\n";
  obj.fun();

  
cout<<"end of main\n";
    return 0;
 }
