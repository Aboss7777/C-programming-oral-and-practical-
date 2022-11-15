import java.util.Scanner;

public class matrix2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of matrix rows");
        int r=sc.nextInt();
        System.out.println("Enter The number of matrix columns");
        int c=sc.nextInt();
        matrix ob=new matrix();

        int[][] matrix1 = new int [r][c];
        int[][] matrix2 = new int [r][c];
        System.out.println("Enter matrix data for 1: ");
        ob.read(sc, matrix1, r, c);
        System.out.println("matrix 1 is: ");
        ob.display(matrix1, r, c);
        System.out.println("Enter matrix data for 2: ");
        ob.read(sc, matrix2, r, c);
        System.out.println("matrix 2 is: ");
        ob.display(matrix2, r, c);
        System.out.println("The addition of matrices is: ");
        ob.add(matrix1, matrix2, r, c);
    }
}

class matrix{
    void read(Scanner sc, int[][] matrix, int r, int c){
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
    void add(int[][] matrix1, int[][] matrix2, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix1[i][j]+matrix2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
