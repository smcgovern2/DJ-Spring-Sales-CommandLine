package edu.wctc.sales;

import edu.wctc.sales.iface.SalesInput;
import edu.wctc.sales.iface.SalesReport;
import edu.wctc.sales.iface.ShippingPolicy;
import edu.wctc.sales.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@ComponentScan("edu.wctc.sales")
public class AppConfig {
    @Bean
    public SalesInput salesInput() throws IOException {

        return new TextFileInput("sales.txt");
        //return new CommandLineInput();

    }

    @Bean
    public SalesReport salesReport() {

        return new CountrySummaryReport();
        //return new DetailedReport();
    }

    @Bean
    public ShippingPolicy shippingPolicy() {

        return new FlatRateDomestic();
        //return new FreeShipping();
    }
}
