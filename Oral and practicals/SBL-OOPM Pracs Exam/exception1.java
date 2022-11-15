import java.util.Scanner;

public class exception1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a even number to find sqaure of ");
        int num=sc.nextInt();
        try{
            if(num%2!=0){
                throw new OddException("Enter only even numbers!");
            }
            else    
                System.out.println("The square of given number is: "+num*num);
        }
        catch(OddException e){
            System.out.println("Exception found: "+e);
        }
    }
}
class OddException extends Exception{
    OddException(String msg){
        System.out.println("Error!"+msg);
    }
}
