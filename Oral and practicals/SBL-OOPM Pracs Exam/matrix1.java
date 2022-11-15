import java.util.Scanner;

public class matrix1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of matrix rows");
        int r=sc.nextInt();
        System.out.println("Enter The number of matrix columns");
        int c=sc.nextInt();
        matrix ob=new matrix();

        int[][] matrix = new int [r][c];
        ob.read(sc, matrix, r, c);
        System.out.println("Your matrix is: ");
        ob.display(matrix, r, c);
        System.out.println("The transpose of matrix is: ");
        ob.transpose(matrix, r, c);
    }
}

class matrix{
    void read(Scanner sc, int[][] matrix, int r, int c){
        System.out.println("Enter matrix data: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
    }
    void display(int[][] matrix, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void transpose(int[][] matrix, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }
    }
}
