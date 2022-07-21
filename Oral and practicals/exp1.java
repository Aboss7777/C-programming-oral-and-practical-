import java.util.*;
public class exp1{
	public static void main(String[] args){
		Scanner n=new Scanner(System.ln);
		System.out.print("Enter the Marks:");
		int a=n.nextInt();
		a=a/10;
		
		switch (a){
			case 0:
			System.out.println("Fail");
			break;
			case 1:
			System.out.println("Fail");
			break;
			case 2:
			System.out.println("Fail");
			break;
			case 3:
			System.out.println("Fail");
			break;
			case 4:
			System.out.println("Pass");
			break;
			case 5:
			System.out.println("Second Class");
			break;
			case 6:
			System.out.println("First Class");
			break;
			case 7:
			System.out.println("Distinction");
			break;
			case 8:
			System.out.println("Distinction");
			break;
			case 9:
			System.out.println("Distinction");
			break;
			case 10:
			System.out.println("Topper");
			break;
			default:
			System.out.println("Invalid Marks");
			break;
		}
	}
}