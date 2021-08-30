package edu.wctc.sales;


import edu.wctc.sales.iface.SalesInput;
import edu.wctc.sales.iface.SalesReport;
import edu.wctc.sales.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReportBuilder {

    private SalesInput input;
    private SalesReport report;
    private ShippingPolicy shippingPolicy;

        @Autowired

    public ReportBuilder(SalesInput input, SalesReport report, ShippingPolicy shippingPolicy) {
        this.input = input;
        this.report = report;
        this.shippingPolicy = shippingPolicy;
    }

    public void build(){
            report.generateReport(input.getSales(),shippingPolicy);
    }
}
