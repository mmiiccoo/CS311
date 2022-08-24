import static java.lang.String.valueOf;
import java.lang.*;

public class test {
    public static void main(String[] args) {

    }
    
    public static String whatCentury(int year) {
      String whatCentury;
      String w;
      int lastDigit;
      int century;
      
      
      century = (year + 99) / 100;
      
      lastDigit = century % 10 ;
      
      if (lastDigit == 1){
        w = "st";
      } else if (lastDigit == 2){
        w = "nd";
      } else if (lastDigit == 3){
        w = "rd";
      } else {
        w = "th";
      }
      
      whatCentury = century + w;
      // coding here
      return whatCentury;
    }

}
