package no.example.labenum;
import static no.example.labenum.SimpleEnumExample.Days;

public class EnumInIfStatement {
    public String enumInIf(Days day) {
        if(day == Days.SUNDAY) {
            return "Its Sunday :-)";
        }else if (day == Days.MONDAY) {
            return "Its Monday :*--(";
        }else if (day == Days.TUESDAY) {
            return "Its Tuesday :*-(";
        }else if (day == Days.WEDNESDAY) {
            return "Its Wednesday :*(";
        }else if (day == Days.THURSDAY) {
            return "Its Thursday :)";
        }else if (day == Days.FRIDAY) {
            return "Its Friday ;-D";
        }else {
            return "Its Saturday :=D";
        }
    }
}
