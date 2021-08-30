package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.SalesReport;
import edu.wctc.sales.iface.ShippingPolicy;

import java.util.ArrayList;
import java.util.List;

public class CountrySummaryReport implements SalesReport {

    public void generateReport(List<Sale> salesList, ShippingPolicy shippingPolicy){
        System.out.println("Country Summary Report");
        System.out.println(String.format("%-20s %12s %12s %12s","Country","Amount","Tax","Shipping") );

        ArrayList<String> countries = new ArrayList<String>();
        for (Sale s: salesList) {
            if(!countries.contains(s.getCountry())){
                countries.add(s.getCountry());
            }
        }
        for (String c: countries) {
            String name = c.toString();
            double amount = 0;
            double tax = 0;
            double shipping = 0;

            for (Sale s: salesList) {
                if((s.getCountry()).equals(c)){
                    amount += s.getAmount();
                    tax += s.getTax();
                    shipping += shippingPolicy.getShippingCost(s);
                }
            }

            System.out.println(String.format("%-20s %12.2f %12.2f %12.2f",name,amount,tax,shipping));
        }

    }

}