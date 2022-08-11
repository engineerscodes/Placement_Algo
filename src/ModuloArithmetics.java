/**
 * @author NAVEEN ,
 * 05 Aug, 2022
 */
public class ModuloArithmetics {


  public static void main(String agr[]){

    /*
    a^b=(a^2)^b/2 if b is even
    a^b=(a)(a^b-1) if b is odd
    */

   /*
   *
   * (a+b)%n=(a%n+b%n)%n
   *  (a*b)%n=(a%n*b%n)%n
   */
    System.out.println(gcd(12,33));
    System.out.println(fastPower(3,5));
    System.out.println(fast(3978432,5,1000000007));
  }
  //find (a^b)%n
  //Compute answer modulo 1000000007
  public static long fast(int a,int b,int n){
    /*
     *
     * (a+b)%n=(a%n+b%n)%n
     *  (a*b)%n=(a%n*b%n)%n
     */
    long res=1;
    while (b>0){

      if(b%2==1) //if odd
      {
        res=(res*(a%n))%n;
      }
      a=(a%n*a%n)%n;
      b=b/2;

    }
    return res;
  }

  public static int fastPower(int a,int b){
     int res=1;
     while (b>0){

       if(b%2==1) //if odd
       {
         res=res*a;
       }
       a=a*a;
       b=b/2;

     }
     return res;
  }

  public static int gcd(int a,int b){


     if(b==0)
       return a;
     return gcd(b,a%b);

  }

}
