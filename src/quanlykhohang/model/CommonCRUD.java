package quanlykhohang.model;
import quanlykhohang.model.entities.Product;
import quanlykhohang.utils.ConvertTime;

import java.text.ParseException;
import java.util.*;

public class CommonCRUD {
    public void addProduct(String type, Map<String,Product> mapProduct) throws ParseException, InterruptedException {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Input name:");
        // String name= sc.nextLine();
        // System.out.println("input inventory");
        // int inventory = sc.nextInt();
        // System.out.println("Input price:");
        // double price= sc.nextDouble();
        // System.out.println("Input quantity:");
        // int quantity= sc.nextInt();
        // System.out.println("Input time with format (dd-mm-yy): ");
        // String time = new Scanner(System.in).nextLine();

        ConvertTime convert = new ConvertTime();
        // Date date = convert.stringToDate(time);
        // Product product= new Product(type, name, quantity, price, date, inventory);

        // mapProduct.put(product.getId(), product);
        Product p = new Product("FD", "iceScream", 2, 5, convert.stringToDate("2-11-2010"),3);
        mapProduct.put(p.getId(), p);
        Thread.sleep(500);
        Product p2 = new Product("FD", "meat", 20, 20, convert.stringToDate("20-11-2020"),3);
        mapProduct.put(p2.getId(), p2);
        Thread.sleep(500);
        Product p3 = new Product("CE", "fish", 50, 12, convert.stringToDate("10-8-2011"),3);
        mapProduct.put(p3.getId(), p3);
        Thread.sleep(500);
        Product p4 = new Product("CE", "Egg", 700, 13.3, convert.stringToDate("20-11-2013"),3);
        mapProduct.put(p4.getId(), p4);
        Thread.sleep(500);
        Product p5 = new Product("CE", "milk", 200, 23.3, convert.stringToDate("20-7-2019"),3);
        mapProduct.put(p5.getId(), p5);
        Thread.sleep(500);
        Product p6 = new Product("EL", "beaf", 42, 23.3, convert.stringToDate("11-11-2010"),3);
        mapProduct.put(p6.getId(), p6);
        Thread.sleep(500);
        Product p7 = new Product("EL", "pig", 52, 23.3, convert.stringToDate("20-11-2021"),3);
        mapProduct.put(p7.getId(), p7);
        Thread.sleep(500);
        Product p8 = new Product("EL", "frog", 298, 23.3, convert.stringToDate("18-11-2020"),3);
        mapProduct.put(p8.getId(), p8);
        Thread.sleep(500);
        Product p9 = new Product("FD", "Crab", 2000, 23.3, convert.stringToDate("20-11-2020"),3);
        mapProduct.put(p9.getId(), p9);
        Thread.sleep(500);

        System.out.println(mapProduct);
}

    public String deleteProduct(String id, Map<String,Product> mapProduct){
        Product product = mapProduct.get(id);
        if(product== null) return "Not found product with id: " + id;
        else {
            mapProduct.remove(id);
            System.out.println(mapProduct);
            return "Delete successfully!";
        }
    }

    public String updateProduct(String id, Map<String,Product> mapProduct){
        Scanner Scanner = new Scanner(System.in);
        Product product = mapProduct.get(id);
        if(product== null) return "Not found product with id: " + id;
        else {
            System.out.println("Input new name:");
            String name= Scanner.nextLine();
            product.setName(name);
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
}
