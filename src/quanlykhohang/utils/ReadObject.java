package quanlykhohang.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import quanlykhohang.model.entities.Product;

public class ReadObject {
    public Map<String, Object> readObject() throws IOException {
        Map<String, Object> map = new HashMap<>();
        FileReader fr = new FileReader("d:/ProductsValue.bin");
        BufferedReader br = new BufferedReader(fr);
        String line ="";
        while (true){
            line= br.readLine();
            if(line==null){
                break;
            }
            String id = line.substring(line.indexOf("id=")+4, line.indexOf("name=")-1).trim();
            String name =line.substring(line.indexOf("name=")+5, line.indexOf("price=")-1).trim();
            double price = Double.parseDouble(line.substring(line.indexOf("price=")+6).trim());
            int quantity = Integer.parseInt(line.substring(line.indexOf("quantity=")+9).trim());
            int inventory = Integer.parseInt(line.substring(line.indexOf("inventory=")+10).trim());
            String type = line.substring(line.indexOf("type=")+5, line.indexOf("id=")-1).trim();
            Date inputDay = new Date(Long.parseLong(line.substring(line.indexOf("inputDay=")+9).trim()));
            map.put(id, new Product(type, name, quantity, price, inputDay, inventory));
        }
        return map;
    }
}
