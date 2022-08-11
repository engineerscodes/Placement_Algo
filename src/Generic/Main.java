package Generic;

/**
 * @author NAVEEN ,
 * 10 Aug, 2022
 */
public class Main {

  public static void main(String agr[]){

    Student[] s=new Student[]{
            new Student("Naveen",21),new Student("Bala",20)
    };
    PhpStudent[] p=new PhpStudent[]{
            new PhpStudent("Thi lak",34),new PhpStudent("Ramu",50)
    };

   Records<Student> rs=new Records<>(s);
   Display d=new Display();
   d.show(rs);
   Records<PhpStudent> rp=new Records<>(p);
      d.show(rp);

  }

}
