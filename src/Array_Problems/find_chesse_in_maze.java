package Array_Problems;

import java.util.Arrays;

/**
 * @author NAVEEN ,
 * 14 Aug, 2022
 */
public class find_chesse_in_maze {

  public static void main(String ags[]){


    int maze[][]={{1,0,1,1,1,0,0,1},{1,0,0,0,1,1,1,1},{1,0,0,0,0,0,0,0},
      {1,0,1,0,9,0,1,1}, {1,1,1,0,1,0,0,1},{1,0,1,0,1,1,0,1},{1,0,0,0,0,1,0,1},{1,1,1,1,1,1,1,1}
    };

    for(int i=0;i<maze.length;i++)
      System.out.println(Arrays.toString(maze[i]));

     System.out.println(find_path(maze,0,0));
  }

  public static boolean find_path(int maze[][],int i,int j){

     if(i<0 || j<0 || i>=maze.length || j>=maze[0].length || maze[i][j]==0)
       return false;
     if(maze[i][j]==9)
       return true;
    maze[i][j]=0;
    boolean op1,op2,op3,op4;
    op1 = find_path(maze,i+1,j);
    op2 = find_path(maze,i,j+1);
    op3 = find_path(maze,i-1,j);
    op4 = find_path(maze,i,j-1);
    maze[i][j] = 1;
    return (op1|| op2 || op3 || op4);

  }

}
