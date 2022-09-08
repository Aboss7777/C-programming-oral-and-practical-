import java.util.Scanner;
public class Exp6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            System.out.println("Enter the Number of Matrix Rows");
            int matrixRow = scan.nextInt();
            System.out.println("Enter the Number of Matrix Columns");
            int matrixCol = scan.nextInt();
            matrix ob = new matrix();

            int[][] matrix = new int[matrixRow][matrixCol];
            ob.read(scan, matrix, matrixRow, matrixCol);
            System.out.println("Your Matrix is: ");
            ob.display(matrix, matrixRow, matrixCol);
            System.out.println("Transpose of matrix is: ");
            ob.transpose(matrix, matrixRow, matrixCol);
    } 
}

class matrix{
    void read(Scanner scan, int[][] matrix, int matrixRow, int matrixCol){
        System.out.println("Enter Matrix Data");
            for(int i=0; i<matrixRow; i++){
                for(int j=0; j<matrixCol; j++){
                    matrix[i][j] = scan.nextInt();
                }
            }
    }

    void display(int[][] matrix, int matrixRow, int matrixCol){
        for(int i=0; i<matrixRow; i++){
            for(int j=0; j<matrixCol; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void transpose(int[][] matrix, int matrixRow, int matrixCol){
        for(int i=0; i<matrixRow; i++){
            for(int j=0; j<matrixCol; j++){
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }   
    }          
}                                           
