package za.ac.mzilikazi.Conf;

import org.springframework.*;
import za.ac.mzilikazi.Service.Payable;
import za.ac.mzilikazi.Service.Implementation.InvoiceImp;
import za.ac.mzilikazi.Service.Implementation.ManufactorImp;
import za.ac.mzilikazi.Service.Implementation.SupplierImp;

/**
 * Created by mandisi on 2017-03-26.
 */
public class AppConfig {

    @Bean(name="i")
    public Payable getInvoice(){
        return new InvoiceImp();
    }

    @Bean(name="m")
    public Payable getManufactor(){
        return new ManufactorImp();
    }
    @Bean(name="s")
    public Payable getSupplier(){
        return new SupplierImp();
    }
}
