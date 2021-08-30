package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CommandLineInput implements SalesInput {
    Scanner scanner = new Scanner(System.in);


    public CommandLineInput() {
    }

    @Override
    public List<Sale> getSales() {
        boolean loop = true;
        List sales = new ArrayList<Sale>();
        while(loop == true) {
            Sale sale = new Sale("","",0, 0);
            System.out.println("Enter Name:");
            sale.setName(scanner.nextLine());
            System.out.println("Enter Country");
            sale.setCountry(scanner.nextLine());
            System.out.println("Enter Amount");
            sale.setAmount(Double.parseDouble(scanner.nextLine()));
            System.out.println("Enter Tax");
            sale.setTax(Double.parseDouble(scanner.nextLine()));
            System.out.println("Add Another Record? y/n");
            if(!scanner.nextLine().toLowerCase().equals("y")){
                loop = false;
            }

        }
        return sales;
    }
}
