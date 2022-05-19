#include<stdio.h>
int main()
{
	int n,a,b,c,i;
	printf("Enter the number of terms: ");
	scanf("%d",&n);
	a=0;
	b=1;
	printf("\n%d\t%d\t",a,b);
	for(i=1;i<=n;i++)
	{
		c=a+b;
		a=b;
		b=c;
		printf("%d\t",c);
	}
	printf("\n");
	return 0;
}

