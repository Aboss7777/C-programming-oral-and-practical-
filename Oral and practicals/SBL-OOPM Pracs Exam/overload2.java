import java.util.*;
public class overload2{
    void Area(double radius){
        double A=radius*radius*3.14;
        System.out.println("The area of Circle is: "+A);
    }
    void Area(double length, double breadth){
        double A=length*breadth;
        System.out.println("The area of Rectangle is: "+A);
    }
    public static void main(String args[]){
        overload2 obj = new overload2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The radius of circle");
        double radius = sc.nextDouble();
        obj.Area(radius);
        System.out.println("Enter length of rectangle");
        double length = sc.nextDouble();
        System.out.println("Enter breadth of rectangle");
        double breadth = sc.nextDouble();
        obj.Area(length, breadth);
    }
}