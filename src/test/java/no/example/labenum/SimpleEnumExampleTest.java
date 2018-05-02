package no.example.labenum;
import static no.example.labenum.SimpleEnumExample.Days;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleEnumExampleTest {
    @Test
    public void simpleEnumExampleInsideClassTest(){
        Days day = SimpleEnumExample.Days.SUNDAY;
        System.out.println("Days enum is set a value: "+ day);
        assertEquals(SimpleEnumExample.Days.valueOf("SUNDAY"), day);
    }
}