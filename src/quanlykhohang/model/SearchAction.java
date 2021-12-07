package quanlykhohang.model;

import quanlykhohang.model.entities.Product;
import quanlykhohang.utils.dataToFiles;

import java.io.IOException;
import java.util.Date;
import java.util.Map;

public class SearchAction {
    // Xem về nạp chồng -> nó chính là tính đa hình
    public String searchByType(String type, Map<String, Product> mapProduct) throws IOException{
        dataToFiles.readFile();
        int count=0;
        for (Map.Entry<String, Product> entry : mapProduct.entrySet()) {
            if(entry.getValue().getType().equalsIgnoreCase(type)){
                System.out.println(entry.getValue().toString());
                count++;
            }
        }
        if(count==0) 
            return "\nData does not exist";
        else 
            return "";
    }

    public void searchByName(String name, Map<String, Product> mapProduct) throws IOException{
        dataToFiles.readFile();
        int count = 0;
        for (Map.Entry<String, Product> entry : mapProduct.entrySet()){
            if (entry.getValue().getName().equalsIgnoreCase(name)){
                count++;
                System.out.println(entry.getValue().toString());
            }
        }
        if (count == 0){
            System.out.println("\nData does not exist");
        }
    }

    public void searchInDateRangeEnter(Date from, Date to, Map<String, Product> mapProduct) throws IOException{
        dataToFiles.readFile();
        int count=0;
        for (Map.Entry<String, Product> entry : mapProduct.entrySet()) {
            if(entry.getValue().getInputDay().after(from) && entry.getValue().getInputDay().before(to)){
                count++;
                System.out.println(entry.getValue().toString());
            }
        }
        if(count==0) 
            System.out.println("\nData does not exist");
    }
   
    public void searchInPriceRange(double from, double to, Map<String,Product> mapProduct) throws IOException{
        dataToFiles.readFile();
        int count=0;
        for (Map.Entry<String, Product> entry : mapProduct.entrySet()) {
            if(entry.getValue().getPrice()>= from && entry.getValue().getPrice()<= to){
                count++;
                System.out.println(entry.getValue().toString());
            }
        }
        if(count==0) 
            System.out.println("\nData does not exist");
    }
}
