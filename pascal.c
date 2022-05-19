#include<stdio.h>
int main()
{
	int i, j,row , space, temp = 1;
	printf("Enter number of rows : ");
	scanf("%d",&row);
	for(i = 0; i< row; i++)
	{
		for(space=1; space<=row-i; space++)
        	printf("  ");

        	for(j = 0; j<=i; j++)
        	{
        		if (i == 0 || j == 0)
               		temp = 1;
        		else
               		temp = temp*(i-j+1)/j;
               		printf("%4d", temp);
        	}	
                printf("\n");
        } 
    	return 0;
}
