import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rama on 10/7/17.
 */
public class Matriks {
    Scanner scan;


    public void CreateMatrix(){

        scan = new Scanner(System.in);
        System.out.println("Input N: ");
        int n = Integer.parseInt(scan.nextLine());
        int num = 0;
        int column1 = 0;
        int column2 = n-1;
        int row1= 0;
        int row2 = n-1;
        int [][] matrix = new int[n][n];
        for(int a=1;a<=n*n;a++) {
            for (int x=column1; x<=column2; x++) {
                matrix[row1][x] = num;
                num++;
                if(num>9){
                    num=0;
                }
                a++;
            }
            for (int x=row1+1; x<=row2;x++){
                matrix[x][column2]=num;
                num++;
                if(num>9){
                    num=0;
                }
                a++;
            }
            for(int x=column2-1;x>=column1;x--){
                matrix[row2][x]=num;
                num++;
                if(num>9){
                    num=0;
                }
                a++;
            }
            for(int x=row2-1;x>=row1+1;x--){
                matrix[x][column1]=num;
                num++;
                if(num>9){
                    num=0;
                }
                a++;
            }
            column1++;
            column2--;
            row1++;
            row2--;
        }
        for(int b=0;b<n;b++) {
            for(int c=0;c<n;c++) {
                System.out.print(matrix[b][c]);
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        Matriks matrix = new Matriks();
        matrix.CreateMatrix();
    }

//    public void DisplayMatrix(){
//        for(int i=0; i<)
//
//    }
}
