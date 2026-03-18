#include <iostream>

using namespace std;


int main()
{
    // We can create one reference to one variable
    int no=11;
    int &x=no;
   
    //We  can create multiple Reference for single variable 
    int &y=no;
    //We can create Reference to a reference 
    int &z=y;


return 0;
}