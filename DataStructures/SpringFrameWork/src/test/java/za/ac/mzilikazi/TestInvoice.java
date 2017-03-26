package za.ac.mzilikazi;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.mzilikazi.Conf.AppConfig;
import za.ac.mzilikazi.Domain.Invoice;
import za.ac.mzilikazi.Service.Payable;

/**
 * Created by mandisi on 2017-03-26.
 */
public class TestInvoice {

    private Payable pay;

    @Before
    public void setUp() throws Exception {
        ApplicationContext ctx = new  AnnotationConfigApplicationContext(AppConfig.class);
        pay = (Payable)ctx.getBean("i");

    }

    @Test
    public void testPayable() throws Exception {
        Invoice invoice = pay.getPaymentAmount();
        System.out.print("Invoice details: "+ pay.getPaymentAmount().getPartNumber());
        Assert.assertEquals(invoice.getPartNumber(),"3722");
    }
}
