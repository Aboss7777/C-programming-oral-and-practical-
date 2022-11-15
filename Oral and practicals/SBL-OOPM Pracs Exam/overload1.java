import java.util.*;
public class overload1{
    void Area(int side){
        int A=side*side;
        System.out.println("The area of square is: "+A);
    }
    void Area(double height, double base){
        double A=0.5*height*base;
        System.out.println("The area of Triangle is: "+A);
    }
    public static void main(String args[]){
        overload1 obj = new overload1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The side of square");
        int side = sc.nextInt();
        obj.Area(side);
        System.out.println("Enter height of triangle");
        double height = sc.nextDouble();
        System.out.println("Enter base of traingle");
        double base = sc.nextDouble();
        obj.Area(height, base);
    }
}