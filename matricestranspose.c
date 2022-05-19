#include<stdio.h>
int main()
{
	int m1[3][3],m2[3][3],ran[3][3];
	printf("Enter elements for matrix A\n");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			printf("Enter Matrix element [%d][%d]",i+1,j+1);
			scanf("%d",&m1[i][j]);
		}
	}
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			ran[i][j]=m1[j][i];
		}
	}
	printf("The transpose of matrix is\n");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			printf("%d\t",ran[i][j]);
			if(j==3-1)
			{
				printf("\n\n");
			}
		}
	}
	return 0;
}
	
