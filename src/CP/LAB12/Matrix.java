package CP.LAB12;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 14 Aug, 2022
 */
public class Matrix {


  public static void main(String arg[]){

    int matrix[][]={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};

    for(int i=0;i<matrix.length;i++)
      System.out.println(Arrays.toString(matrix[i]));

    clockwise(matrix);
    anticlockwise(matrix);


  }


  public static void clockwise(int matrix[][]){

    ArrayList<Integer> arr=new ArrayList<>();

    int top=0,left=0;
    int bottom=matrix.length;
    int right=matrix[0].length;

    while (top<bottom && left<right){

      for(int i=left;i<right;i++){
        arr.add(matrix[top][i]);
      }
      top++;

      for(int i=top;i<bottom;i++){
        arr.add(matrix[i][right-1]);
      }
      right--;

      if(left>=right || top>=bottom){
          break;
      }

      for(int i=right-1;i>=left;i--){
        arr.add(matrix[bottom-1][i]);
      }
      bottom--;
      for (int i=bottom-1;i>=top;i--){
        arr.add(matrix[i][left]);
      }
      left++;
    }

    System.out.println("ClockWise : "+arr);


  }

  public static  void anticlockwise(int matrix[][]){

    ArrayList<Integer> arr=new ArrayList<>();

    int top=0,left=0;
    int bottom=matrix.length;
    int right=matrix[0].length;

    while (top<bottom && left<right){

      for (int i=top;i<bottom;i++){
        arr.add(matrix[i][left]);
      }
      left++;
      for(int i=left;i<right;i++){
        arr.add(matrix[bottom-1][i]);
      }
      bottom--;
      if(left>=right || top>=bottom){
        break;
      }
      for(int i=bottom-1;i>=top;i--)
       arr.add(matrix[i][right-1]);
      right--;

      for(int i=right-1;i>=left;i--)
        arr.add(matrix[top][i]);
      top++;


    }

    System.out.println("Anticlockwise : "+arr);
  }

}
