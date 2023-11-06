package localDateTime;

import java.time.LocalDateTime;

public class Main2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int dayOfYear = now.getDayOfYear();
        int hour = now.getHour();
        int minute = now.getMinute();

        System.out.println("Год: " + year);
        System.out.println("dayOfYear: " + dayOfYear);
        System.out.println("hour: " + hour);
        System.out.println("minute: " + minute);



    }
}
