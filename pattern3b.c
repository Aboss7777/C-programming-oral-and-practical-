#include<stdio.h>
int main()
{
	int i,j,r;
	printf("Enter number of rows : ");
	scanf("%d",&r);
	for(i=r;i>=1;i--)
	{
		char c='A';
		for(j=1;j<=i;j++)
		{
			printf("%c",c);
			c++;
		}
		printf("\n");
	}
	return 0;
}
