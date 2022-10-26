package Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author NAVEEN ,
 * 05 Sep, 2022
 */

class undirected_graphs extends graphs{


    undirected_graphs(int v) {
        super(v);
    }

    public void insert(int src, int des,int cost){
         super.insert(src,des,cost);
         super.insert(des,src,cost);
    }

}

public class undirected_Dijiktra {


    public static void main(String agr[]){

        undirected_graphs g=new undirected_graphs(9);

        g.insert(0,1,4);
        g.insert(0,7,8);
        g.insert(1,7,11);
        g.insert(1,2,8);
        g.insert(7,8,7);
        g.insert(6,7,1);
        g.insert(2,8,2);
        g.insert(8,6,6);
        g.insert(2,5,4);
        g.insert(2,3,7);
        g.insert(6,5,2);
        g.insert(3,5,14);
        g.insert(3,4,9);
        g.insert(4,5,10);


        System.out.println(g);


        PriorityQueue<Travel> q=new PriorityQueue<Travel>(new Comparator<Travel>() {
            @Override
            public int compare(Travel o1,Travel o2) {
                return o1.cur_cost-o2.cur_cost;
            }
        });

        boolean visited[][]=new boolean[g.no_vertex][g.no_vertex];
        int cost=0;
        int src=0;
        int des=4;
        // visited[src]=true;
        Travel s=new Travel(src,cost,cost);
        q.add(s);

        while (!q.isEmpty()){

            Travel temp=q.poll();
            int cur_node=temp.des;
            int edge_cost=temp.cost;
            int total_cost=temp.cur_cost;
            if(cur_node==des){
                System.out.println("MIN COST : "+temp.cur_cost);
                return;
            }

            ArrayList<graphs.pair> cur_neg=g.g.get(cur_node);

            for(int i=0;i<cur_neg.size();i++){
                if(!visited[cur_node][cur_neg.get(i).des]){
                q.add(new Travel(cur_neg.get(i).des,cur_neg.get(i).cost,total_cost+cur_neg.get(i).cost));
                visited[cur_node][cur_neg.get(i).des]=true;
                }
            }

        }

    }

}
