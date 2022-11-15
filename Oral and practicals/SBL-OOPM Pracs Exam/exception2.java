import java.util.Scanner;

public class exception2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a prime number to find sqaure of ");
        int num=sc.nextInt();
        try{
            int c=0;
            for(int i=num;i>0;i--){
                if(num%i==0){
                    ++c;
                }
            }
            if(c==2){
                System.out.println("The square of given number is: "+num*num);
            }
            else
                throw new NonPrimeException("Enter only prime numbers!");
        }
        catch(NonPrimeException e){
            System.out.println("Exception found: "+e);
        }
    }
}
class NonPrimeException extends Exception{
    NonPrimeException(String msg){
        System.out.println("Error!"+msg);
    }
}
