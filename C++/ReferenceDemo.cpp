#include <iostream>

using namespace std;
// class Demo{
    
//     int 
//     // Demo(){
//     //     this->i=0;
//     //     this->j=0;
//     // }
//     // Demo(int a ,int b)
//     // {
//     //     this->i=a;
//     //     this->j=b;
//     // }
  

// }

int main()
{
    int no=11;
  int &x=no;
  cout<<"value of no :"<<no<<"\n"; //11
  cout<<"value of x :"<<x<<"\n";//11

   cout<<"Address of no :"<<&no<<"\n"; // 100(address);
   cout<<"Address of x :"<<&x<<"\n"; //100(address);

 cout<<"Size of no:"<<sizeof(no)<<'\n'; //4
 cout<<"Size of x:"<<sizeof(x)<<'\n';   //4 same no no copy  




}