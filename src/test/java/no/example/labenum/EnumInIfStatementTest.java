package no.example.labenum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static no.example.labenum.SimpleEnumExample.Days;
import static org.junit.Assert.assertEquals;

public class EnumInIfStatementTest {
    private EnumInIfStatement enumInIfStatement;

    @Before
    public void setUp() {
        enumInIfStatement = new EnumInIfStatement();
    }

    @After
    public void tearDown() {
        enumInIfStatement = null;
    }

    @Test
    public void enumInIfTest() {
        String result = enumInIfStatement.enumInIf(Days.SUNDAY);
        System.out.println(result);
        assertEquals("Its Sunday :-)", result);
    }
}
