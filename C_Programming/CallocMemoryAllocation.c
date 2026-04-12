# include <stdio.h>
#include <stdlib.h>

int main()
{
//    float marks[5];
    int size=0;
   float *marks=NULL;
   int i=0;
  printf("enter number pf elements:\n");
  scanf("%d",&size);

  //Dynamic Memory Allocation
  marks=(float *)calloc(size,sizeof(float));

    printf("Enter the marks:\n");
    
    for( i=0;i<size;i++)
    {
        scanf("%f",&marks[i]);

    }
    printf("Enter the marks are:\n");

    for(i=0;i<size;i++)
    {
        printf("%f\n",marks[i]);
    }

  free(marks);
  return 0;
}