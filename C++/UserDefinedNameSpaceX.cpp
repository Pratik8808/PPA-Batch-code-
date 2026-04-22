#include <iostream>

namespace Marvellous
{
    int no=11;
    void fun()
    {
        std::cout<<"Inside the fun\n";
    }
}

using namespace Marvellous;
int main ()
{
    std::cout<<"Jay ganesh ...\n";
   fun(); // Error
    return 0; 
}