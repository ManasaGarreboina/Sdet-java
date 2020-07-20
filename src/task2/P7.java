package task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class P7 {
    public static void main(String[] args) 
    { 
        // Get the String 
    	String string = "July 20, 2020";
  
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);

        System.out.println(date);
    } 

}
