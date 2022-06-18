package OOPS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author NAVEEN ,
 * 11 Jun, 2022
 */
public class try_catchs {

  public static void main(String args[]){

    try {
      int i = Integer.parseInt("9");
      System.out.println(i);
    }catch (NumberFormatException e) {
      System.out.println(e);
    }

  }

}


