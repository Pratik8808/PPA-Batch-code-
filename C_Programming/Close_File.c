#include <stdio.h>
#include <fcntl.h>
#include <unistd.h> // Universal standard file 

int main ()
{
  int fd=0;
  fd=open("Marevlleous.txt",O_RDWR);

  if(fd ==-1)
  {
    printf("Unable to open the file");

  }
  else{
    printf("File gets opened with fd%d\n",fd);
  }
  close(fd);

    return 0;

}
