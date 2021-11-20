package quanlykhohang.model;

import quanlykhohang.model.entities.Product;

import java.util.*;

public class SortAction {
    public void sortBy(Map<String, Product> mapProduct){
        Map<String, Double> map3 = new HashMap<>();
        for (Map.Entry<String, Product> entry : mapProduct.entrySet()){
            map3.put(entry.getKey(),entry.getValue().getPrice());
        }
        map3.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        // xem lòng lặp foreach -> đây alf cách viết ngắn gọn của vòng lặp foreach, mỗi vòng lặp in ra 1 object
        System.out.println(map3);
    }

    public void multipleFilter(Map<String, Product> mapProduct, int select){
        LinkedList<Product> list = new LinkedList<>(mapProduct.values());
        if(select==2){
            list.sort(Comparator.comparing(Product::getType).thenComparing(Product::getInputDay));
            System.out.println(list);
        }else if(select==3){
            /*
            * Xem comparator
            * Product::getType so sánh trường type trong Product*/
            list.sort(Comparator.comparing(Product::getType).thenComparing(Product::getPrice));
            System.out.println(list);
        }
    }

    public void filterBy(Map<String, Product> mapProduct, int select){
        LinkedList<Product> list = new LinkedList<>(mapProduct.values());
        if(select==1){
            list.sort(Comparator.comparing(Product::getType));
            System.out.println(list);
        }else if(select==2){
            list.sort(Comparator.comparing(Product::getInputDay));
            System.out.println(list);
        }else if(select==3){
            list.sort(Comparator.comparing(Product::getPrice));
            System.out.println(list);
        }
    }
}
