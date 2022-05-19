#include<stdio.h>
int main()
{
	int searcher(int arr[],int n);
	int arr[100],n;
	printf("Enter no of elements in array: ");
	scanf("%d",&n);
	printf("Enter the array elements\n");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	searcher(arr,n);
	return 0;
}

int searcher(int arr[],int n)
{
	int a,i,flag=0;
	printf("Enter the element you want to search\n");
	scanf("%d",&a);
	for(i=0;i<n;i++)
	{
		if(arr[i]==a)
		{
			flag=1;
			break;
		}
	}
	if(flag==0) 
		printf("Element %d not found in array",a);
	else 
		printf("The element %d was found at index of %d\n",a,i+1);
	return 0;
}
