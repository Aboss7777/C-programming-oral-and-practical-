#include<stdio.h>
#include<conio.h>
int a[10];
char name[20];
float salary;
struct marksheet{
	char s_name[20];
	char roll[12];
	int sub1,sub2,sub3;
}m1;
int *i;
char *c;
float *f;
struct marksheet *m;

void main(){
clrscr();
i=&a[0];
c=name;
f=&salary;
m=&m1;
//printf("address of a= %p\n",i);
//printf("address of name = %p\n",c);
//printf("address of salary = %p\n",f);
//printf("address of marksheet = %p\n",m);
printf("Enter name, roll no, marks of subject1,2,3:");
scanf("%s%s%d%d%d", &m->s_name, &m->roll, &m->sub1, &m->sub2, &m->sub3);
printf("Name=%s\n roll no=%s \n marks of sub1,2,3=%d,%d,%d",m->s_name,m->roll,m->sub1,m->sub2,m->sub3);
getch();
}




