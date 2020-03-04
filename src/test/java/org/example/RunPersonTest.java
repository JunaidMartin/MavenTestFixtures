package org.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class RunPersonTest
{
    Person pers1 = new Person("Amy","Johnston", 39, "1313131548");
    Person pers2 = new Person("Junaid", "Martin,", 23, "457845678");
    Person pers3 = pers1;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testObjectEquality()
    {
        assertEquals("Amy", pers1.getName());
    }
    @Test
    public void testObjectID()
    {
        assertSame(pers1, pers3);
    }

    @Test
    public void testFail()
    {
        assertEquals("Yusrah", pers1.getName());
    }

    @Test (timeout = 0002)
    public void testTimeout()
    {
        assertEquals("Amy", pers1.getName());
    }

    @Ignore
    @Test
    public void testDisable()
    {
        assertSame(pers1, pers3);
    }
}
