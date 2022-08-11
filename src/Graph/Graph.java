package Graph;

import java.util.*;

/**
 * @author NAVEEN ,
 * 11 Aug, 2022
 */
public class Graph {

    static class Cost{
        int cost;
        int edge;

        Cost(int edge,int cost){
            this.cost=cost;
            this.edge=edge;
        }

        @Override
        public String toString() {
            return "des: "+edge+" cost : "+cost;
        }
    }
    static class Tuples{
        int cost,city,steps;
        Tuples(int cost,int city,int steps){
            this.cost=cost;
            this.city=city;
            this.steps=steps;
        }
    }

   static ArrayList<List<Cost>> arr=new ArrayList<List<Cost>>();
    public static void main(String agr[]){

        int n=4;
        int src=0;
        int des=3;
        int k=1;
        int g[][]={{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        for(int i=0;i<n;i++){
           arr.add(new ArrayList<Cost>());
        }
        for(int i=0;i<g.length;i++){

            insert(g[i][0],g[i][1],g[i][2]);
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(i+"--> "+arr.get(i));
        }

       /* PriorityQueue<Tuples> q=new PriorityQueue<>(new Comparator<Tuples>() {
            @Override
            public int compare(Tuples o1, Tuples o2) {
                return o1.cost-o2.cost;
            }
        });*/

        PriorityQueue<Tuples> q=new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        q.add(new Tuples(0,src,0));

        while (!q.isEmpty()){
            Tuples temp=q.poll();
            if(temp.city==des){
                System.out.println("Min cost :"+temp.cost+" with stops :"+k);
                return;
            }
            if(temp.steps>k){
                  continue;
            }
            else{
                ArrayList<Cost> curr=(ArrayList<Cost>) arr.get(temp.city);
                for(int i=0;i<curr.size();i++){
                    q.add(new Tuples(temp.cost+curr.get(i).cost,curr.get(i).edge,temp.steps+1));
                }
            }

        }

        System.out.println("Not possible u kid "+-1);
    }
    public static void insert(int src,int des,int cost){
        arr.get(src).add(new Cost(des,cost));
    }



}
