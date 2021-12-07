package quanlykhohang.utils;

import quanlykhohang.model.entities.Product;

import java.io.*;
import java.util.*;
public class dataToFiles {
    // function write file from Map
    public static void writeFile(Map<String, Product> products) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("d:/ProductsValue.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            for (Map.Entry<String, Product> entry : products.entrySet()) {
                dos.writeUTF(entry.getValue().toString2()+("\n"));
            }
            dos.close();
            fos.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("d:/ProductsValue.bin");
            DataInputStream dis = new DataInputStream(fis);
            while (dis.available() > 0) {
                System.out.println(dis.readUTF());
            }
            dis.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile() throws IOException {
        File file = new File("d:/ProductsValue.bin");
        if (file.exists()) {
            file.delete();
        }
    }

    public static void saveFile(Map<String, Product> products) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("d:/ProductsValue.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            for (Map.Entry<String, Product> entry : products.entrySet()) {
                dos.writeUTF(entry.getValue().toString2()+("\n"));
            }
            dos.close();
            fos.close();    
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
