#include <iostream>
using namespace std;

template <class X> // Template Header and T-> Template Variable ( it can any )
X addition (X A,X B)
{
    X Ans;
    Ans=A+B;
    return Ans;

}

int main ()
{
    cout<<addition(10,11)<<"\n";
    cout<<addition(10.3f,11.2f)<<"\n";
     cout<<addition(10.34567,11.234567)<<"\n";
    return 0;
}