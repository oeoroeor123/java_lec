package pkg02_date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class02_SimpleDateFormat {

  public static void main(String[] args) {
  
    /*
     * 년도  : yy, yyyy
     *   월  : M, MM
     *   일  : d, dd
     * 요일  : E
     * 오전  : a
     *시간12 : h, hh (ex_오후 3시), 오전 오후 구분을 위해 a와 함께 써야한다.
     *시간24 : H, HH (ex_15시)
     *   분  : m, mm
     *   초  : s, ss
     *밀리초 : SSS
     * 
     */
    
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("a h:mm yyyy-MM-dd");
    String result = sdf.format(date);
    System.out.println(result);
  
  }

}
