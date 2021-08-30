package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.SalesReport;
import edu.wctc.sales.iface.ShippingPolicy;

import java.util.List;

public class DetailedReport implements SalesReport {



    public void generateReport(List<Sale> salesList, ShippingPolicy shippingPolicy){
        System.out.println("SALES DETAIL REPORT");
        System.out.println(String.format("%-20s %20s %12s %12s %12s","Customer","Country","Amount","Tax","Shipping") );
        for (Sale s: salesList
             ) {
            System.out.println(String.format("%-20s %20s %12.2f %12.2f %12.2f",s.getName(),s.getCountry(),s.getAmount(),s.getTax(),shippingPolicy.getShippingCost(s)));
        }





    }

}
