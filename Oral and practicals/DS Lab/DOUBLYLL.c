#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
	struct node *prev;
};

struct node *head=NULL;

void begininsert(){
	struct node *new_node;
	int val;
	new_node = (struct node*)malloc(sizeof(struct node));
	printf("\nEnter Value: \n");
	scanf("%d",&val);
	new_node -> data=val;
	if(head==NULL){
		head=new_node;
		head -> next=NULL;
		head -> prev=NULL;
	}
	else{
		new_node -> next=head;
		new_node -> prev=NULL;
		head -> prev=new_node;
		head=new_node;
	}
}
void endinsert(){
	struct node *new_node, *temp;
	int val;
	new_node = (struct node*)malloc(sizeof(struct node));
	printf("\nEnter Value: \n");
	scanf("%d",&val);
	new_node -> data=val;
	if(head==NULL){
		head=new_node;
		head -> next=NULL;
		head -> prev=NULL;
	}
	else{
		temp=head;
		while(temp->next!=NULL)
		temp=temp->next;
		temp->next=new_node;
		new_node->prev=temp;
		new_node->next=NULL;
	}
}
void afterinsert(){
	struct node *new_node, *temp;
	int val,data1;
	new_node = (struct node*)malloc(sizeof(struct node));
	printf("\nEnter Value: \n");
	scanf("%d",&val);
	new_node -> data=val;
	printf("\nInsert after which data: \n");
	scanf("%d",&data1);
	temp=head;
	while(temp->data!=data1)
		temp=temp->next;
	new_node->prev=temp;
	new_node->next=temp->next;
	temp->next->prev=new_node;
	temp->next=new_node;
}
void beforeinsert(){
	struct node *new_node, *temp;
	int val,data1;
	new_node = (struct node*)malloc(sizeof(struct node));
	printf("\nEnter Value: \n");
	scanf("%d",&val);
	new_node -> data=val;
	printf("\nInsert before which data: \n");
	scanf("%d",&data1);
	temp=head;
	while(temp->data!=data1)
		temp=temp->next;
	new_node->next=temp;
	new_node->prev=temp->prev;
	temp->prev->next=new_node;
	temp->prev=new_node;
}
void begindelete(){
	struct node *temp;
	int a;
	if(head==NULL) printf("Underflow\n");
	else{
		temp=head;
		head=head->next;
		head->prev=NULL;
		a=temp->data;
		free(temp);
		printf("The number deleted is %d",a);
	}
}
void end_delete(){
	struct node *temp;
	int a;
	if(head==NULL) printf("Underflow\n");
	else{
		temp=head;
		while(temp->next!=NULL)
			temp=temp->next;
		temp->prev->next=NULL;
		a=temp->data;
		free(temp);
		printf("The number deleted is %d",a);
	}
}
void anydelete(){
	struct node *temp;
	int data1,a;
	printf("Enter the data of node to be deleted: \n");
	scanf("%d",&data1);
	if(head==NULL) printf("Underflow");
	else{
		temp=head;
		while(temp->data!=data1)
			temp=temp->next;
		temp->prev->next=temp->next;
		temp->next->prev=temp->prev;
		a=temp->data;
		free(temp);
		printf("The number deleted is %d",a);
	}
}
void display(){
	struct node *temp;
	printf("\nPrinting Values...\n");
	temp=head;
	while(temp!=NULL){
		printf("%d\n",temp->data);
		temp=temp->next;
	}
}
void main(){
	int ch,j=0,a;
	while(j==0){
		printf("\n1.begininsert\n2.endinsert\n3.afterinsert\n4.beforeinsert\n5.begindelete\n6.end_delete\n7.anydelete\n8.display\n");
		printf("\nAny other number to exit");
		printf("\nEnter Your choice: ");
		scanf("%d",&ch);
		switch(ch){
			case 1:
				begininsert();
				break;
			case 2:
				endinsert();
				break;
			case 3:
				afterinsert();
				break;
			case 4:
				beforeinsert();
				break;
			case 5:
				begindelete();
				break;
			case 6:
				end_delete();
				break;
			case 7:
			    anydelete();
				break;
			case 8:
				display();
				break;
			default:
			{
				printf("Invalid choice exiting program\n");
				j=1;
			}
		}
	}
}
