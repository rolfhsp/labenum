package no.example.labenum;

import java.util.ArrayList;

public class EnumIteration {
    enum Days{
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }
    public ArrayList<String> enumIteration() {
        Days[] days = Days.values();
        ArrayList<String> stringDay = new ArrayList<String>();
        for (Days day : days) {
            stringDay.add(day.toString());
        }
        return stringDay;
    }
}