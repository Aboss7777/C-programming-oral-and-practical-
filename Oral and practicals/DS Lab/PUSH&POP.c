#include <stdio.h>
#include <conio.h>

#define MAX 3
int STACK[50];
int top=-1,data,choice=1;
void push()
{
	if(top==MAX-1)
		printf("Stack is full\n");
	else
	{
		printf("Enter elements to be pushed\n");
		scanf("%d",&data);
		top=top+1;
		STACK[top]=data;
	}
}
int pop()
{
	if(top==-1)
	{
		printf("Stack is empty\n");
		return 0;
	}
	else
	{
		int popped_item=STACK[top];
		top=top-1;
		return popped_item;
	}
}
void display(int i)
{
	printf("\nThe Stack Elements are:\n");
	for(i=top;i>=0;i--)
	{
		printf("\n%d",STACK[i]);
	}
}
void main()
{
	int i,choice,j=1,a;
	clrscr();
	while(j==1)
	{
		printf("\n1.Push\n2.Pop\n3.Display\nEnter your choice: \n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
			{
				push();
				break;
			}
			case 2:
			{
				a=pop();
				printf("The popped element is %d",a);
				break;
			}
			case 3:
			{
				display(i);
				break;
			}
			default:
			{
				printf("Invalid choice Exiting program\n");
				j=0;
			}
		}
	}
	getch();
}

/**************OUTPUT***********
```
1.Push
2.Pop
3.Display
Enter your choice:
1
Enter elements to be pushed
7

1.Push
2.Pop
3.Display
Enter your choice:
1
Enter elements to be pushed
8

1.Push
2.Pop
3.Display
Enter your choice:
1
Enter elements to be pushed
9

1.Push
2.Pop
3.Display
Enter your choice:
1
Stack is full

1.Push
2.Pop
3.Display
Enter your choice:
3

The Stack Elements are:

9
8
7
1.Push
2.Pop
3.Display
Enter your choice:
2
The popped element is 9
1.Push
2.Pop
3.Display
Enter your choice:
2
The popped element is 8
1.Push
2.Pop
3.Display
Enter your choice:
2
The popped element is 7
1.Push
2.Pop
3.Display
Enter your choice:
2
Stack is empty
The popped element is 0
1.Push
2.Pop
3.Display
Enter your choice:
4
Invalid choice Exiting program

[Program finished]
```********/
