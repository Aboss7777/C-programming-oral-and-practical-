#include<stdio.h>
#include<math.h>
int main()
{
	int ch,a,b;
	printf("1.Addition\n 2.Subtraction\n 3.Multiplication\n Enter Your choice: ");
	scanf("%d",&ch);
	switch(ch)
	{
		case 1:
		{
			printf("Enter two numbers ");
			scanf("%d%d",&a,&b);
			printf("The addition of the two numbers is %d\n",a+b);
			break;
		}
		case 2:
		{
			printf("Enter two numbers ");
			scanf("%d%d",&a,&b);
			printf("The subtraction of the two numbers is %d\n",a-b);
			break;
		}
		case 3:
		{
			printf("Enter two numbers ");
			scanf("%d%d",&a,&b);
			printf("The multiplication of the two numbers is %d\n",a*b);
			break;
		}
		default:
		{
			printf("Invalid Choice\n");
		}
	}
	return 0;
}	
