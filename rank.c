#include<stdio.h>
int main()
{
	int m1,m2,m3,total;
	float per;
	printf("Enter your marks of 3 subjects: ");
	scanf("%d%d%d",&m1,&m2,&m3);
	total=m1+m2+m3;
	per=(total*100)/300;
	if((per<=100)&&(per>=70))
		printf("Distinction\n");
	else if((per<=69)&&(per>=60))
		printf("First Class\n");
	else if((per<=59)&&(per>=40))
		printf("Second Class\n");
	else if(per<40)
		printf("FAIL\n");
	return 0;
}
