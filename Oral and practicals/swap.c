#include <stdio.h>

void swap(int *x,int *y)
{
    int temp=*x;
    *x=*y;
    *y=temp;
    printf("After Swapping the numbers x=%d, y=%d",*x,*y);
}

int main()
{
    int a,b;
    printf("Enter 2 numbers x and y to swap ");
    scanf("%d%d",&a,&b);
    swap(&a,&b);
    return 0;
}
