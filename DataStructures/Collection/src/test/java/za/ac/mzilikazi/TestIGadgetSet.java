package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mandisi on 2017-03-26.
 */
public class TestIGadgetSet {

    IGadgetSet appliances;

    @Before
    public void setUp() throws Exception {
        appliances = new IGadgetSet("Macbook");
    }

    @Test
    public void testKitchenSet() throws Exception {
        Set <String> set = new HashSet<String>();

        set.add("iPhone");
        set.add("iPad");
        set.add("iPod");
        set.add(appliances.getAppliance());

        System.out.print("IGadget set list: " + set + "\n" );
        System.out.print("Number of appliances in the set is: " + set.size() + "\n");

        set.remove("iPod");
        System.out.print("IGadget set after removing an iPod: " + set + "\n");
        System.out.print("current number of appliances is: " + set.size());

        Assert.assertEquals("Macbook", appliances.getAppliance());
    }
}
