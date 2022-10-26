package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author NAVEEN ,
 * 25 Aug, 2022
 *
 *
 */
public class bfd {


    static int vertex;

    static ArrayList<Integer> arr[];

    bfd(int n){
        vertex=n;
        arr=new  ArrayList[n];
        for(int i=0;i<vertex;i++)
            arr[i]=new ArrayList<>();
    }


    public static void insert(int src,int des){
        if(src!=des)
         arr[src].add(des);
    }

    public static void dfs(int src){

        Stack<Integer> st=new Stack<>();
        boolean visited[]=new boolean[vertex];
        st.add(src);

        while (!st.isEmpty()){



        }

    }
    public static void bfs(int src){

        boolean visited[]=new boolean[vertex];

        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        visited[src]=true;

        while (!q.isEmpty()){
            int curr=q.poll();
            System.out.println(curr);

            ArrayList<Integer> neg=arr[curr];
            for(int i=0;i< neg.size();i++){

                if(!visited[neg.get(i)]){
                    q.add(neg.get(i));
                    visited[neg.get(i)]=true;
                }

            }




        }




    }


    public static void main(String agr[]){


        bfd b=new bfd(4);

        insert(0,1);
        insert(0,2);
        insert(2,0);
        insert(2,3);
        insert(1,2);

        bfs(2);

    }

}
