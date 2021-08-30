package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.ShippingPolicy;

public class FlatRateDomestic implements ShippingPolicy {
    @Override
    public double getShippingCost(Sale sale) {
        if(sale.getCountry().equals("United States")){
            return 5.00;
        }
        else {
            return (sale.amount * .1);
        }
    }
}
