import java.util.HashMap;
import java.util.HashSet;

/**
 * @author NAVEEN ,
 * 07 Sep, 2022
 */
public class Udaan {

  static HashSet<calendar> app =new HashSet<>();

  static class calendar{
    String m[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
    int max[]={31,28,31,30,31,30,31,31,30,31,30,31};
    int day=-1;
    int month;
    int year;
    boolean booked;
    public calendar(int day,int month,int year){

      if(day>max[month-1]){
        System.out.println(day +" "+max[month-1]);
        return;
      }
      this.year=year;
      this.month=month;
      this.day=day;
      this.booked=true;

    }

    @Override
    public String toString() {
      if(month>0)
       return m[this.month-1]+" "+this.day+" th is booked "+this.booked+" "+year+" yr";
      else
        return "not possible";
    }
  }



  public static void main(String agr[]){


    calendar d1=new calendar(10,2,2001);
    calendar d2=new calendar(35,2,2001);
    calendar d3=new calendar(9,5,2001);
    calendar d4=new calendar(30,1,2001);
    calendar d5=new calendar(10,2,2001);



    app.add(d1);
    app.add(d2);
    //app.add(d3);
    app.add(d4);
    app.add(d5);
    if(app.contains(d3))
    System.out.println(app);




  }

}
