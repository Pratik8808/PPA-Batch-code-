#include <iostream>
using namespace std;

class Maverllous
{
public:
    int no1, no2;

    Maverllous()
    {
        cout << "Inside Default  constrctor\n";
        no1 = 0;
        no2 = 0;
    }

    // Paramertized Constructor
    Maverllous(int A, int B)
    {
        cout << "Inside Default  constrctor\n";
        no1 = A;
        no2 = B;
    }

    // Copy Constructor
    Maverllous(Maverllous &ref)
    {
        cout << "Inside copy  Constructor\n";
        no1=ref.no1;
        no2=ref.no2;
    }
    ~Maverllous()
    {
        cout<<"Inside Destructor";
    }
};

int main()
{
    cout << "Inside The Main";
    
    Maverllous mobj1; // default Constructor
    Maverllous mobj2(11, 21);                   // Paramertized Constructor
     Maverllous mobj3(mobj2);                    //

    // cout << mobj1.no1 << "\n";
    // cout << mobj1.no2 << "\n";
    cout<<"End of main\n";
} // All Destructor is called