package quanlykhohang.model;

import quanlykhohang.model.entities.Product;

import java.util.Date;
import java.util.Map;

public class SearchAction {
    // Xem về nạp chồng -> nó chính là tính đa hình
    public String searchBy(String type, Map<String, Product> mapProduct){
        int count=0;
        for (Map.Entry<String, Product> entry : mapProduct.entrySet()) {
            if(entry.getValue().getType().equalsIgnoreCase(type)){
                System.out.println(entry.getValue().toString());
                count++;
            }
        }
        if(count==0) 
            return "Nothing to find =[[[";
        else 
            return "";
    }
    // tìm trong khoản ngày nhập
    public String searchBy(Date from, Date to, Map<String,Product> mapProduct){
        int count=0;
        for (Map.Entry<String, Product> entry : mapProduct.entrySet()) {
            if(entry.getValue().getInputDay().after(from) && entry.getValue().getInputDay().before(to)){
                System.out.println(entry.getValue().toString());
                count++;
            }
        }
        if(count==0) 
            return "Nothing to find =[[[";
        else 
            return "";
    }

    // tìm trong khoản giá
    public String searchBy(double from, double to, Map<String,Product> mapProduct){
        int count=0;
        for (Map.Entry<String, Product> entry : mapProduct.entrySet()) {
            if(entry.getValue().getPrice()>=from && entry.getValue().getPrice()<= to){
                System.out.println(entry.getValue().toString());
                count++;
            }
        }
        if(count==0) 
            return "Nothing to find =[[[";
        else 
            return "";
    }
}
