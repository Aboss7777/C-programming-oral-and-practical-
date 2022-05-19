#include<stdio.h>
int main()
{
	int BS;
	float DA,HRA,GS;
	printf("Enter Basic Salary : ");
	scanf("%d",&BS);
	DA=0.5*BS;
	HRA=0.4*BS;
	GS=BS+DA+HRA;
	printf("Your Gross Salary is %f\n",GS);
	return 0;
}
