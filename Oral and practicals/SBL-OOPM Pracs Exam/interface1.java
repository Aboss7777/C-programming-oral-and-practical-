import java.util.Scanner;

class student{
    int rollno;
    void getnum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        rollno=sc.nextInt();
    }
    void putnum(){
        System.out.println("the roll number is: "+rollno);
    }
}
class test extends student{
    float sem1,sem2;
    void getmarks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sem1 and Sem2 Marks respectively: ");
        sem1=sc.nextFloat();
        sem2=sc.nextFloat();
    }
    void putmarks(){
        System.out.println("the sem1 marks are : "+sem1+"\nthe sem2 marks are : "+sem2);
    }
}
interface sports{
    public static final float score=20;
    void putscore();
}
class result extends test implements sports{
    float total;
    void display(){
        total=sem1+sem2+score;
        putnum();
        putmarks();
        putscore();
        System.out.println("The total marks are: "+total);
    }
    public void putscore(){
        System.out.println("The score is: "+score);
    }
}
public class interface1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        result ob=new result();
        ob.getnum();
        ob.getmarks();
        ob.display();
    }
}
