package CP.LAB12;



public class Tree_N_Ary {
    static  Tree root;

    public static void preOrder(Tree root){

        if(root ==null)
            return;


        System.out.print(root.data+" ");

        for(int i=0;i<root.children.size();i++){

            preOrder(root.children.get(i));

        }



    }

    public static void main(String agr[]){

         root=new Tree(10);
         root.insert(8);
         root.insert(5);
         //node 8
         root.children.get(0).insert(2);
         root.children.get(0).insert(1);
         root.children.get(0).insert(6);
        //children  of 5
        root.children.get(1).insert(7);
        root.children.get(1).insert(8);
        root.children.get(1).insert(3);
        root.children.get(1).insert(4);

        //children of node 1 -node 8
        root.children.get(0).children.get(1).insert(9);
        root.children.get(0).children.get(1).insert(11);
        // Add child node 7 of 5
        root.children.get(1).children.get(0).insert(-1);
        // Add child node 4 of 5
        root.children.get(1).children.get(3).insert(2);
        root.children.get(1).children.get(3).insert(1);
        root.children.get(1).children.get(3).insert(3);

        preOrder(root);



    }

}
