#include<stdio.h>
#include<math.h>
int main()
{
	int n,c=0,p,sum=0,digit,temp;
	printf("Enter the Number: ");
	scanf("%d",&n);
	temp=n;
	while(n>0)
	{
		n=n/10;
		c++;
	}
	n=temp;
	
	while(n>0)
	{
		digit=n%10;
		n=n/10;
		p=pow(digit,c);
		sum=sum+p;
	}
	if(sum==temp)
		printf("It is Armstrong Number\n");
	else
		printf("It is not armstrong number\n");
	return 0;
}
		
