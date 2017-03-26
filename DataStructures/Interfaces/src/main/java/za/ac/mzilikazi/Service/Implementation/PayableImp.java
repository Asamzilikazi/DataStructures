package za.ac.mzilikazi.Service.Implementation;

import za.ac.mzilikazi.domain.Invoice;
import za.ac.mzilikazi.Service.Payable;

/**
 * Created by mandisi on 2017-03-26.
 */
public class PayableImp implements Payable {
    public Invoice getPaymentAmount()
    {
        Invoice invoice = new Invoice("3722","Computer chip",4,750.00);
        invoice.getPaymentAmount();
        return invoice;
    }
}
