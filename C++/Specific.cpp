#include <iostream>
using namespace std;

int addition (int A,int B)
{
    int Ans;
    Ans=A+B;
    return Ans;

}
float addition (float A,float B)
{
    float Ans;
    Ans=A+B;
    return Ans;
}
int main ()
{
    cout<<addition(10,11)<<"\n";
    cout<<addition(10.3f,11.2f)<<"\n";
    return 0;
}