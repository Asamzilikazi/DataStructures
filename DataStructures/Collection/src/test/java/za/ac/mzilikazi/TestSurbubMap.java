package za.ac.mzilikazi;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
/**
 * Created by mandisi on 2017-03-26.
 */
public class TestSurbubMap {

    SurbubMap surbub1;
    SurbubMap surbub2;
    SurbubMap surbub3;

    @Before
    public void setUp() throws Exception {
        surbub1 = new SurbubMap("7784", "Khayelitsha");
        surbub2 = new SurbubMap("7780", "Lansdown");
        surbub3 = new SurbubMap("7750", "Nyanga");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testStatesHashMaps() throws Exception {
        HashMap<String, String> surbubs = new HashMap<String, String>();

        surbubs.put(surbub1.getCode(), surbub1.getName());
        surbubs.put(surbub2.getCode(), surbub2.getName());
        surbubs.put(surbub3.getCode(), surbub3.getName());

        System.out.print("Surbub names " + surbubs + "\n");
        System.out.print("The number of surbubs is: " + surbubs.size() + "\n");

        surbubs.remove("7784");
        System.out.print("List of surbubs after removing Khayelitsha " + surbubs + "\n");
        System.out.print("The number of surbubs is now: " + surbubs.size() + "\n");

        surbubs.clear();
        System.out.print("When all surbubs are removed: " + surbubs + "\n");
        System.out.print("The number of surbubs is now: " + surbubs.size() + "\n");

        Assert.assertEquals("7780", surbub2.getCode());
    }
}
