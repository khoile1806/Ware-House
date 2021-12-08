package quanlykhohang.model;

import java.io.IOException;
import java.util.*;
import quanlykhohang.model.entities.Product;
import quanlykhohang.utils.dataToFiles;

public class Export {
	public void exportAll(Map<String,Product> mapProduct) throws IOException{
		dataToFiles.readFile();
		mapProduct.clear();
    }

	public void exportByType(Map<String,Product> mapProduct, String type) throws IOException{
		dataToFiles.readFile();
		for (Map.Entry<String,Product> entry : mapProduct.entrySet()){
			entry.getValue().getType().equalsIgnoreCase(type);
			mapProduct.remove(type);
		}
	}
}
