import java.util.Scanner;

class Shapes {
    double area;
    void Triangle(double base, double height){
        area=0.5*base*height;
        System.out.println("The area of Triangle is :"+area);
    }
    void Circle(double x){
        area=3.14*x*x;
        System.out.println("The area of Circle is :"+area);
    }
}

public class area2{
    public static void main(String args[]){
        Shapes ob1=new Shapes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height :");
        double height = sc.nextDouble();
        System.out.println("Enter base :");
        double base = sc.nextDouble();
        ob1.Triangle(base, height);
        System.out.println("Enter radius :");
        double radius = sc.nextDouble();
        ob1.Circle(radius);
    }
}

