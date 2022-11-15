import java.util.Scanner;

class complex1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double r,i;
        complex C=new complex();
        System.out.println("Enter the first Number: ");
        r=sc.nextInt();
        i=sc.nextInt();
        complex A= new complex(r,i);
        A.show();
        System.out.println("Enter the second Number: ");
        r=sc.nextInt();
        i=sc.nextInt();
        complex B= new complex(r,i);
        B.show();
        C.sum(A,B);
    }
}

class complex{
    double real,img;
    complex(){
        real=0;
        img=0;
    }
    complex(double r, double i){
        real=r;
        img=i;
    }
    void show(){
        System.out.println("The Number: "+real+"+"+img+"i");
    }
    public void sum(complex A, complex B){
        real=A.real+B.real;
        img=A.img+B.img;
        System.out.println("The Addition is: "+real+"+"+img+"i");
    }
}
