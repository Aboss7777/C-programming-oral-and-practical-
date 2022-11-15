import java.util.*;
public class grades1{
    public static void main(String args[]){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter The marks: ");
        int a = n.nextInt();
        a=a/10;
        switch(a){
            case 0,1,2,3:
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
            case 7,8,9,10:
                System.out.println("DISTINCTION");
                break;
            default:
                System.out.println("Please enter valid marks under 100");
        }
    }
}