import java.util.Scanner;

class palindrome1{
    Scanner sc=new Scanner(System.in);
    String str;
    String rev;
    StringBuffer strl=new StringBuffer();
    void input(){
        System.out.println("Enter a String");
        str=sc.nextLine();
        strl.append(str);
    }
    void palindrome(){
        strl.reverse();
        rev=strl.toString();
        if(str.equalsIgnoreCase(rev))
            System.out.println(str+" is a palindrome");
        else
            System.out.println(str+" is not a palindrome");
    }
}

public class palindrome {
    public static void main(String args[]){
        palindrome1 ob=new palindrome1();
        ob.input();
        ob.palindrome();
    }
}
