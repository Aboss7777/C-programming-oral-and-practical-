import java.util.*;
class Exp4{
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
		obj.Area(1.2);
		obj.Area(5);
		obj.Area(5,6);
		obj.Area(8.5,5.5);
	}
}
		
