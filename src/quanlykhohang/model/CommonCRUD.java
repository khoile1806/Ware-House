package quanlykhohang.model;
import quanlykhohang.model.entities.Product;
import quanlykhohang.utils.ConvertTime;
import quanlykhohang.utils.dataToFiles;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class CommonCRUD {
    public void addProduct(String type, Map<String,Product> mapProduct) throws ParseException, InterruptedException, IOException {
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

        // FODD Product
        Product f = new Product("FD", "iceScream", 30000, 15, convert.stringToDate("10-11-2016"),32);
        mapProduct.put(f.getId(), f);
        Thread.sleep(200);
        Product f2 = new Product("FD", "meat", 25000, 20, convert.stringToDate("10-11-2016"),12);
        mapProduct.put(f2.getId(), f2);
        Thread.sleep(200);
        Product f3 = new Product("FD", "fish", 56500, 12, convert.stringToDate("10-11-2016"),63);
        mapProduct.put(f3.getId(), f3);
        Thread.sleep(200);
        Product f4 = new Product("FD", "Egg", 70000, 53, convert.stringToDate("10-11-2016"),54);
        mapProduct.put(f4.getId(), f4);
        Thread.sleep(200);
        Product f5 = new Product("FD", "milk", 20000, 23, convert.stringToDate("10-11-2016"),45);
        mapProduct.put(f5.getId(), f5);
        Thread.sleep(200);
        Product f6 = new Product("FD", "beef", 42000, 33, convert.stringToDate("15-11-2016"),12);
        mapProduct.put(f6.getId(), f6);
        Thread.sleep(200);
        Product f7 = new Product("FD", "pig", 50200, 29, convert.stringToDate("15-11-2016"),36);
        mapProduct.put(f7.getId(), f7);
        Thread.sleep(200);
        Product f8 = new Product("FD", "frog", 29800, 6, convert.stringToDate("15-11-2016"),33);
        mapProduct.put(f8.getId(), f8);
        Thread.sleep(200);
        Product f9 = new Product("FD", "Crab", 80000, 83, convert.stringToDate("15-11-2016"),14);
        mapProduct.put(f9.getId(), f9);
        Thread.sleep(200);
        Product f10 = new Product("FD", "chicken", 26000, 10, convert.stringToDate("15-11-2016"),300);
        mapProduct.put(f10.getId(), f10);
        Thread.sleep(200);

        // Ceramic Products
        Product c = new Product("CE", "cups", 30000, 15, convert.stringToDate("10-11-2016"),32);
        mapProduct.put(c.getId(), c);
        Thread.sleep(200);
        Product c2 = new Product("CE", "plates", 25000, 20, convert.stringToDate("10-12-2016"),12);
        mapProduct.put(c2.getId(), c2);
        Thread.sleep(200);
        Product c3 = new Product("CE", "bowls", 56500, 12, convert.stringToDate("10-12-2016"),63);
        mapProduct.put(c3.getId(), c3);
        Thread.sleep(200);
        Product c4 = new Product("CE", "teapots", 70000, 53, convert.stringToDate("10-12-2016"),54);
        mapProduct.put(c4.getId(), c4);
        Thread.sleep(200);
        Product c5 = new Product("CE", "pots", 20000, 23, convert.stringToDate("10-12-2016"),45);
        mapProduct.put(c5.getId(), c5);
        Thread.sleep(200);
        Product c6 = new Product("CE", "jars", 42000, 33, convert.stringToDate("15-12-2016"),12);
        mapProduct.put(c6.getId(), c6);
        Thread.sleep(200);
        Product c7 = new Product("CE", "mortars", 50200, 29, convert.stringToDate("15-12-2016"),36);
        mapProduct.put(c7.getId(), c7);
        Thread.sleep(200);
        Product c8 = new Product("CE", "chopsticks", 29800, 6, convert.stringToDate("15-12-2016"),33);
        mapProduct.put(c8.getId(), c8);
        Thread.sleep(200);
        Product c9 = new Product("CE", "spoons", 80000, 83, convert.stringToDate("15-12-2016"),14);
        mapProduct.put(c9.getId(), c9);
        Thread.sleep(200);
        Product c10 = new Product("CE", "rice bowls", 26000, 10, convert.stringToDate("15-12-2016"),300);
        mapProduct.put(c10.getId(), c10);
        Thread.sleep(200);


        // Electrical Products
        Product E = new Product("EL", "refrigerator", 30000, 15, convert.stringToDate("10-10-2016"),32);
        mapProduct.put(E.getId(), E);
        Thread.sleep(200);
        Product E2 = new Product("EL", "washing machine", 25000, 20, convert.stringToDate("10-10-2016"),12);
        mapProduct.put(E2.getId(), E2);
        Thread.sleep(200);
        Product E3 = new Product("EL", "dishwasher", 56500, 12, convert.stringToDate("10-10-2016"),63);
        mapProduct.put(E3.getId(), E3);
        Thread.sleep(200);
        Product E4 = new Product("EL", "coffee maker", 70000, 53, convert.stringToDate("10-10-2016"),54);
        mapProduct.put(E4.getId(), E4);
        Thread.sleep(200);
        Product E5 = new Product("EL", "water heater", 20000, 23, convert.stringToDate("10-10-2016"),45);
        mapProduct.put(E5.getId(), E5);
        Thread.sleep(200);
        Product E6 = new Product("EL", "calculator", 42000, 33, convert.stringToDate("15-10-2016"),12);
        mapProduct.put(E6.getId(), E6);
        Thread.sleep(200);
        Product E7 = new Product("EL", "clock", 50200, 29, convert.stringToDate("15-10-2016"),36);
        mapProduct.put(E7.getId(), E7);
        Thread.sleep(200);
        Product E8 = new Product("EL", "TV", 29800, 6, convert.stringToDate("15-10-2016"),33);
        mapProduct.put(E8.getId(), E8);
        Thread.sleep(200);
        Product E9 = new Product("EL", "keyboard", 80000, 83, convert.stringToDate("15-10-2016"),14);
        mapProduct.put(E9.getId(), E9);
        Thread.sleep(200);
        Product E10 = new Product("EL", "Lap top", 26000, 10, convert.stringToDate("15-10-2016"),300);
        mapProduct.put(E10.getId(), E10);
        Thread.sleep(200);
        System.out.print(mapProduct);
        dataToFiles.writeFile(mapProduct);
        System.out.println(mapProduct);
}

    public String deleteProduct(String id, Map<String,Product> mapProduct) throws IOException{
        dataToFiles.readFile();
        Product product = mapProduct.get(id);
        if(product== null) return "Not found product with id: " + id;
        else {
            mapProduct.remove(id);
            System.out.println(mapProduct);
            return "Delete successfully!";
        }
    }

    public String updateProduct(String id, Map<String,Product> mapProduct) throws IOException{
        dataToFiles.readFile();
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
            System.out.println("input inventory");
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
