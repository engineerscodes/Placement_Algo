package Graph;
import java.util.*;
/**
 * @author NAVEEN ,
 * 17 Sep, 2022
 */
public class Connected_G {

    static int vertex;

    static ArrayList<Integer> arr[];

    Connected_G(int n){
        vertex=n;
        arr=new  ArrayList[n];
        for(int i=0;i<vertex;i++)
            arr[i]=new ArrayList<>();
    }
    public static void addEdge(int src,int des){
        if(src!=des) {
            arr[src].add(des);
            arr[des].add(src);
        }
    }


    public static void dfs(int node,boolean visited[]){

        visited[node]=true;
        System.out.println(node+" ");

        ArrayList<Integer> neg=arr[node];
        for(int i=0;i<neg.size();i++){
            if(!visited[neg.get(i)])
            dfs(neg.get(i),visited);
            //visited[neg.get(i)]=true;
        }

    }

    public static void controller(int src){
        boolean visited[]=new boolean[vertex];
        dfs(src,visited);
        System.out.println("-----------------------------------------------------");
        for(int i=0;i<vertex;i++){
             if(!visited[i]){
                 dfs(i,visited);
                 System.out.println("-----------------------------------------------------");
             }
        }



    }

    public static void main(String agr[]){

        Connected_G g = new Connected_G(5);

        g.addEdge(1, 0);
        g.addEdge(2, 1);
        g.addEdge(3, 4);
        System.out.println(
                "Following are connected components");
        g.controller(0);

    }
}
