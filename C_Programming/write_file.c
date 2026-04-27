// #include <stdio.h>
// #include <fcntl.h>
// #include <unistd.h> // Universal standard file 

// int main ()
// {
//   int fd=0;
//   int Ret=0;
//   char Arr[]="Marvellous Infosystems";
//   fd=open("Marevlleous.txt",O_RDWR);

//   if(fd ==-1)
//   {
//     printf("Unable to open the file");

//   }
//   else{
//     printf("File gets opened with fd%d\n",fd);
//     Ret=write(fd,Arr,10);
//     printf("%d bytes gets written inot file \n",Ret);
//   }
//   close(fd);

//     return 0;

// }



// AI file 
#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main()
{
    int fd = 0;
    int Ret = 0;
    char Arr[] = "Marvellous Infosystems";

    fd = open("Marvellous.txt", O_RDWR | O_CREAT, 0777); // need to check this 

    if(fd == -1)
    {
        perror("Unable to open file");
    }
    else
    {
        printf("File gets opened with fd %d\n", fd);
        Ret = write(fd, Arr, 10);
        printf("%d bytes written into file\n", Ret);
    }

    close(fd);
    return 0;
}
