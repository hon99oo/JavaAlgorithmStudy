package doodles;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        LocalDateTime timePoint = LocalDateTime.now();
        Month month = timePoint.getMonth();
        System.out.println(month);
        System.out.println(month);
    }
}
