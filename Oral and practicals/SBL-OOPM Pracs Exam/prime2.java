public class prime2 {
    public static void main(String args[]){
        System.out.println("The prime numbers between 1 to 100 are: ");
        int i=0,j=0;
        for(i=1;i<=100;i++){
            int c=0;
            for (j=1;j<=i;j++){
                if (i%j==0)
                    ++c;
            }
            if(c==2)
                System.out.print(i+",");
        }
    }
}
