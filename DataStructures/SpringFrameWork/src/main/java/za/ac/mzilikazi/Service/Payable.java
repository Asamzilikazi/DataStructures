package za.ac.mzilikazi.Service;

import za.ac.mzilikazi.Domain.Invoice;

/**
 * Created by mandisi on 2017-03-26.
 */
public interface Payable {
    Invoice getPaymentAmount();
}
