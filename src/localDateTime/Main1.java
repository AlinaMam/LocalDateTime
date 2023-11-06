package localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main1 {
    public static void main(String[] args) {
        LocalDateTime date1 = LocalDateTime.of(2014, 9, 19, 14, 5);
        LocalDateTime date2 = LocalDateTime.of(2014, 9, 19, 14, 5, 20);
        LocalDateTime date3 = LocalDateTime.of(2014, 9, 19, 14, 5, 20, 9);

        LocalDate date = LocalDate.now();
        LocalDateTime localDateTime = date.atTime(14, 30, 59, 999999);
        System.out.println(localDateTime);

        LocalTime time = LocalTime.now();
        LocalDateTime localDateTime1 = time.atDate(date);
        System.out.println(localDateTime1);


    }
}
