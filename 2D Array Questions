/*
Question 1 : Print the number of 7’s that are in the 2d array.
Example :
Input - int[][] array = { {4,7,8},{8,8,7} };
Output - 2
*/
//Solution:-
public class basic {
   public static int total_count(int matrix[][],int key){
    int count=0;
    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==key){
                count++;
            }
        }
    }
    return count;
   }
    public static void main(String args[]){
        int matrix[][]= { {4,7,8},{8,8,7} };
      System.out.println( "The key element occurs "+total_count(matrix, 7)+" times");
        
    }
}


/*
Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
Example :
Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
Output - 18
*/
//Solution:-
public class basic {
    public static void main(String args[]){
        int matrix[][]= { {1,4,9},{11,4,3},{2,2,3} };
     int sum=0;
     for(int j=0;j<matrix[0].length;j++){
        sum+=matrix[1][j];
     }
        System.out.println("The sum of second row of array is:"+sum);
    }
}


/*
Question 3 : Write a program to Find Transpose of a Matrix.
What is Transpose?
Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
Matrix
a11 a12 a13
a21 a22 a23
Transposed Matrix
a11 a21
a12 a22
a13 a23
*/
//Solution:-
import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class basic {
    public static void print_matrix(int matrix[][]){
     

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int rows=2;
        int cols=3;
        int matrix[][]= { {2, 3, 7}, {5, 6, 7} };
        print_matrix(matrix);
        int transform[][]=new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transform[j][i]=matrix[i][j];
            }
        }
        System.out.println();
        print_matrix(transform);
    }
}
