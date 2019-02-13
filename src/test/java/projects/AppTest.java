package projects;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    /**
     * Rigorous Test :-)
     */
    MainTest test = new MainTest();

    @Test
    public void add()
    {
        Assert.assertEquals(10, test.add(6,4));
    }

    @Test
    public void divide()
    {
        Assert.assertEquals(2,test.divide(10, 5));
    }

    @Test
    public void subtract()
    {
        Assert.assertEquals(0, test.subtract(50, 50));
    }

    @Test
    public void multiply()
    {
        Assert.assertEquals(100, test.multiply(50, 2));
    }
}
