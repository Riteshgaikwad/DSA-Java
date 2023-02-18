/*
Multi dimensional array:-
 
 1 2 3   1 2 3 
         5 6 7  
         
 Representation:-
      0    1    2
  0  0,0  0,1  0,2           rows=4
  1  1,0  1,1  1,2           columns=3
  2  2,0  2,1  2,2           cells=rows*columns
  3  3,0  3,1  3,2                =4*3=12
                  n * m   n=rows  m=columns
        
*/
//Taking input and output:-

import java.util.Scanner;
public class basics {
  public static void main(String args[]){
    int matrix[][]=new int[3][3];
    Scanner sc=new Scanner(System.in);
    int n=matrix.length;
    int m=matrix.length;
    for(int i=0;i<n;i++){           //Input
      for(int j=0;j<m;j++){
        matrix[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++){           //Output
      for(int j=0;j<m;j++){
        System.out.print((matrix[i][j]+" "));
      }
      System.out.println();
    }
    sc.close();
  }
}

//Searching element in Array

import java.util.Scanner;
public class basic {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("Found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("Not Found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        int n=matrix.length;
        int m=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //output
        search(matrix, 2);
    }
}

/*
->Spiral matrix:-
  
*/
//code:-
import java.util.Scanner;
public class basic {
    public static int diagonal_sum(int matrix[][]){  //o(n2)....
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum+=matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
       System.out.println( diagonal_sum(matrix));
        
    }
}
/*
->Search in sorted array:-
*/
import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.MarginBorder;
public class basic {
  
    public static boolean starecase_search(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found key at: ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
       starecase_search(matrix, 10);
        
    }
}

