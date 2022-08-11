package Generic;

/**
 * @author NAVEEN ,
 * 10 Aug, 2022
 */
public class Display {




    public<T extends Person> void show(Records<T > arr){

        T obj[]=arr.o;

        for(int i=0;i< obj.length;i++)
        {
            System.out.println(obj[i]);

        }


    }



}
