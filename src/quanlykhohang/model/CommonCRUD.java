package quanlykhohang.model;
import quanlykhohang.model.entities.Product;
import quanlykhohang.utils.ConvertTime;

import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class CommonCRUD {
    public void addProduct(String type, Map<String,Product> mapProduct) throws ParseException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input name:");
        String name= sc.nextLine();
        System.out.println("input inventory");
        int inventory = sc.nextInt();
        System.out.println("Input price:");
        double price= sc.nextDouble();
        System.out.println("Input quantity:");
        int quantity= sc.nextInt();
        System.out.println("Input time with format (dd-mm-yy): ");
        String time = new Scanner(System.in).nextLine();

        ConvertTime convert = new ConvertTime();
        Date date = convert.stringToDate(time);
        Product product= new Product(type, name, quantity, price, date, inventory);

        mapProduct.put(product.getId(), product);

        System.out.println(mapProduct);
    }

    public String deleteProduct(String id, Map<String,Product> mapProduct){
        Product product = mapProduct.get(id);
        if(product== null) return "Not found product with id: "+id;
        else {
            mapProduct.remove(id);
            System.out.println(mapProduct);
            return "Delete successfully!";
        }
    }

    public String updateProduct(String id, Map<String,Product> mapProduct){
        Scanner Scanner = new Scanner(System.in);
        Product product = mapProduct.get(id);
        if(product== null) return "Not found product with id: "+id;
        else {
            System.out.println("Input price:");
            double price= Scanner.nextDouble();
            product.setPrice(price);
            System.out.println("input iventory");
            int inventory = Scanner.nextInt();
            product.setInventory(inventory);
            System.out.println("Input quantity:");
            int quantity= Scanner.nextInt();
            product.setQuantity(quantity);
            System.out.println(product.toString());
            return "Update successfully!";
        }
    }

    public static void totalProduct(Map<String,Product> mapProduct){
        int total = 0;
        for(Product product: mapProduct.values()){
            total += product.getQuantity();
        }
        System.out.println("Total product: "+total);
    }
}
