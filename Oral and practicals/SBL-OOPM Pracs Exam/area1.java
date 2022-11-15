import java.util.Scanner;

class Quadrilateral {
    double area;
    void Rectangle(double length, double breadth){
        area=length*breadth;
        System.out.println("The area of reactangle is :"+area);
    }
    void Square(double x){
        area=x*x;
        System.out.println("The area of Square is :"+area);
    }
}

public class area1{
    public static void main(String args[]){
        Quadrilateral ob1=new Quadrilateral();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :");
        double length = sc.nextDouble();
        System.out.println("Enter breadth :");
        double breadth = sc.nextDouble();
        ob1.Rectangle(length, breadth);
        System.out.println("Enter side :");
        double side = sc.nextDouble();
        ob1.Square(side);
    }
}

