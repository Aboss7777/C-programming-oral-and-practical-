#include<stdio.h>
#include<math.h>
int main()
{
	int ch,n,fact=1;
	printf("1.Square root of a number\n 2.Cube of a number\n 3.Check for Prime NUmber\n Enter Your choice: ");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:
		{
			printf("Enter a number ");
			scanf("%d",&n);
			printf("The square root of %d is %f\n",n,sqrt(n));
			break;
		}
		case 2:
		{
			printf("Enter a number ");
			scanf("%d",&n);
			printf("The cube of %d is %d\n",n,n*n*n);
			break;
		}
		case 3:
		{
			printf("Enter a number ");
			scanf("%d",&n);
			int count=0;
			for(int i=2;i<(n/2);i++)
			{	
				if(n%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
			printf("%d is Prime Number\n",n);
			else if(count==1)
			printf("%d is not Prime Number\n",n);
			break;
		}
		default:
		{
			printf("Invalid Choice\n");
		}
	}
	return 0;
}	
