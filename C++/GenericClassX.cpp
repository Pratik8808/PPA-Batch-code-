#include <iostream>
using namespace std;

template <class T>
class Arithematic
{
  public:
      T No1;
      T No2;

      Arithematic(T A, T B)
      {
        this->No1=A;
        this->No2=B;
      }
      T Addition()
      {
        T Ans;
        Ans=No1+No2;
        return Ans;
      }
    T Subtraction()
      {
        T Ans;
        Ans=No1-No2;
        return Ans;
      }

};

int main ()
{
    Arithematic <int> aobj1(12,10); 

    cout<<aobj1.Addition()<<"\n";
    cout<<aobj1.Subtraction()<<"\n";

    Arithematic <float> aobj2(12.2345,10.1234); 

    cout<<aobj2.Addition()<<"\n";
    cout<<aobj2.Subtraction()<<"\n";

    //  Arithematic <double> aobj3(12,10); 

    // cout<<aobj2.Addition()<<"\n";
    // cout<<aobj2.Subtraction()<<"\n";


    return 0;
}
