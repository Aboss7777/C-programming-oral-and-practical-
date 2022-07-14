#include <stdio.h>
 
int main()
{
    int n,arr[100],max;
    printf("Enter size of array:");
    scanf("%d",&n);
    for (int i=0;i<n;i++)
    {
        printf("Enter element [%d]: ",i+1);
        scanf("%d",&arr[i]);
    }
    max=arr[0];
    for (int i=0;i<n;i++)
    {
        if (arr[i]>max)
        max=arr[i];
    }
    printf("the largest arrray element is %d",max);
    return 0;
}
