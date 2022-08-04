import java.util.*;
class Exp4userinput{
	void Area(double r){
		double A=3.14*r*r;
		System.out.println("\n Area of circle: "+A);
	}
	void Area(int side){
		int A=side*side;
		System.out.println("\n Area of square: "+A);
	}
	void Area(int length,int breadth){
		int A=length*breadth;
		System.out.println("\n Area of Rectangle: "+A);
	}
	void Area(double height,double base){
		double A=0.5*height*base;
		System.out.println("\n Area of Triangle: "+A);
	}
	public static void main(String[] args){
		Exp4 obj=new Exp4();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of circle: ");
		double radius=sc.nextDouble();
		obj.Area(radius);
		System.out.println("Enter Side of Square: ");
		int side=sc.nextInt();
		obj.Area(side);
		System.out.println("Enter Length of Rectangle: ");
		int length=sc.nextInt();
		System.out.println("Enter Breadth of Rectangle: ");
		int breadth=sc.nextInt();
		obj.Area(length,breadth);
		System.out.println("Enter Height of Triangle: ");
		double height=sc.nextDouble();
		System.out.println("Enter Base of Triangle: ");
		Double base=sc.nextDouble();
		obj.Area(height,base);
	}
}
		
