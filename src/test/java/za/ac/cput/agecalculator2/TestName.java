package za.ac.cput.agecalculator2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.agecalculator2.Impl.PersonDetailsImpl;

/**
 * Created by student on 2015/02/20.
 */
public class TestName {
    PersonDetails pd;

    @Before
    public void setUp() throws Exception {
        pd = new PersonDetailsImpl();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testName() throws Exception {
        Assert.assertTrue("Name", pd.name("Andisiwe").equals("Andisiwe"));

    }
}
