#include <iostream>
using namespace std;

int main()
{
//    float marks[5];
    int size=0;
   float *marks=NULL;
   int i=0;
  cout<<"enter number pf elements:\n";
  cin>>size;

  //Dynamic Memory Allocationmarks=(float *)malloc(size*sizeof(float));
  marks=new float[size];

    cout<<"Enter the marks:\n";
    
    for( i=0;i<size;i++)
    {
        cin>>marks[i];

    }
    cout<<"Enter the marks are:\n";

    for(i=0;i<size;i++)
    {
        cout<<marks[i]<<"\n";
    }

  delete [] marks;
  return 0;
}