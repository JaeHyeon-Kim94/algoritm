package chap06;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static java.util.Calendar.*;

public class exec06_14 {
    public static void main(String[] args) {
        GregorianCalendar[] x = {
                new GregorianCalendar(2017, NOVEMBER, 1),
                new GregorianCalendar(1963, OCTOBER, 18),
                new GregorianCalendar(1985, APRIL, 5),
        };

        Arrays.sort(x);

        for(GregorianCalendar gc : x){
            System.out.printf("%04d년 %02d월 %02d일\n",
                    gc.get(YEAR),
                    gc.get(MONTH)+1,
                    gc.get(DATE)
            );
        }
    }
}
