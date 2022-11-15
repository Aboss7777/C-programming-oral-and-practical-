import java.util.*;
public class grades2{
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter The marks: ");
        int a = n.nextInt();
        a=a/10;
        switch(a){
            case 0,1,2,3:
                System.out.println("Fail");
                break;
            case 4,5:
                System.out.println("C");
                break;
            case 6,7:
                System.out.println("B");
                break;
            case 8,9,10:
                System.out.println("A");
                break;
            default:
                System.out.println("Please enter valid marks under 100");
        }
    }
}