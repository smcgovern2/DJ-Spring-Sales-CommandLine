package edu.wctc.sales.impl;

import edu.wctc.sales.Sale;
import edu.wctc.sales.iface.SalesInput;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileInput implements SalesInput {

    private List<Sale> sales;

    public TextFileInput(String pathName) throws IOException {
        this.sales = new ArrayList<>();
        build(pathName);


    }

    private void build(String pathName) throws IOException{



        Scanner scanner = new Scanner(new File(pathName));
        try {
            while (scanner.hasNextLine()){
                String[] lineItems = scanner.nextLine().split(",");
                sales.add(new Sale(lineItems[0], lineItems[1], Double.parseDouble(lineItems[2]), Double.parseDouble(lineItems[3])));
            }
        }
        finally{
            scanner.close();
        }
    }


    @Override
    public List<Sale> getSales() {
        return sales;
    }
}
