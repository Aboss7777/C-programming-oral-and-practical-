#include<stdio.h>
#include<math.h>
int main()
{
	int ch,n;
	printf("1.Square root of a number\n 2.Square of a number\n 3.Factorial of a number\n Enter Your choice: ");
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
			printf("The square of %d is %d\n",n,n*n);
			break;
		}
		case 3:
		{
			int fact=1;
			printf("Enter a number ");
			scanf("%d",&n);
			for(int i=1;i<=n;i++)
			{	
				fact=fact*i;
			}
			printf("The factorial of %d is %d\n",n,fact);
			break;
		}
		default:
		{
			printf("Invalid Choice\n");
		}
	}
	return 0;
}	
