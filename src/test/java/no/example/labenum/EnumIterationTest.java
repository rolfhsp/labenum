package no.example.labenum;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EnumIterationTest {
    private EnumIteration enumIteration;
    @Before
    public void setUp() {
        enumIteration = new EnumIteration();
    }
    @After
    public void tearDown() {
        enumIteration = null;
    }
    @Test
    public void enumIterationTest() {
        ArrayList<String> result = enumIteration.enumIteration();
        Iterator iterator = result.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        assertTrue(result.contains("SUNDAY"));
    }
}