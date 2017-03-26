package za.ac.mzilikazi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.mzilikazi.domain.Invoice;
import za.ac.mzilikazi.Service.Implementation.PayableImp;
import za.ac.mzilikazi.Service.Payable;
/**
 * Created by mandisi on 2017-03-26.
 */
public class TestInvoice {

    private Payable payable;

    @Before
    public void setUp() throws Exception {
        payable = new PayableImp();
    }

    @Test
    public void testInvoice() throws Exception {
        Invoice invoice = payable.getPaymentAmount();
        System.out.print("\tInvoice \n" + "----------------------\n" + payable.getPaymentAmount() + "\n");
        System.out.print("Total amount due: " + invoice.getPaymentAmount());
        Assert.assertEquals(invoice.getPartNumber(),"3722");
    }
}
