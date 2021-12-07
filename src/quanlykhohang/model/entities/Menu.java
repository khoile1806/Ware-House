package quanlykhohang.model.entities;

import quanlykhohang.inputTools;
import quanlykhohang.model.CommonCRUD;
import quanlykhohang.model.Export;
import quanlykhohang.model.SearchAction;
import quanlykhohang.model.SortAction;
import quanlykhohang.utils.ConvertTime;
import quanlykhohang.utils.dataToFiles;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class Menu {
    Map<String, Product> mapProduct = new HashMap<>();
    int choose;
    ConvertTime convertTime= new ConvertTime();
    CommonCRUD commonCRUD = new CommonCRUD();
    SearchAction searchAction = new SearchAction();
    SortAction sortAction = new SortAction();
    Statistical statistical = new Statistical();
    Export export = new Export();

    public void showMenu() throws ParseException, InterruptedException, IOException {
        while(true){
            System.out.println("\n------------------");
            System.out.println("        Menu        ");
            System.out.println("1: Add element      ");
            System.out.println("2: Delete element   ");
            System.out.println("3: Update element   ");
            System.out.println("4: Search element   ");
            System.out.println("5: Sort element     ");
            System.out.println("6: Statistic        ");
            System.out.println("7: Export           ");
            System.out.println("8: Exit             ");
            System.out.println("\n------------------");
            System.out.println("Enter your choice:  ");
            System.out.println("                    ");
            choose = inputTools.input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("\n-------------------");
                    System.out.println("        Menu         ");
                    System.out.println("1: Food              ");
                    System.out.println("2: Ceramic           ");
                    System.out.println("3: Electrical        ");
                    System.out.println("\n-------------------");
                    System.out.println("Enter your choice:   ");
                    int select = inputTools.input.nextInt();
                    switch (select){
                        case 1:
                            commonCRUD.addProduct("FD",mapProduct);
                            break;
                        case 2:
                            commonCRUD.addProduct("CE", mapProduct);
                            break;
                        case 3:
                            commonCRUD.addProduct("EL", mapProduct);
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\nInput ID product: ");
                    String id = new Scanner(System.in).nextLine();
                    dataToFiles.writeFile(mapProduct);
                    System.out.println(commonCRUD.deleteProduct(id, mapProduct));
                    break;
                case 3:
                    System.out.println("\nInput ID product: ");
                    String id3 = new Scanner(System.in).nextLine();
                    dataToFiles.writeFile(mapProduct);
                    commonCRUD.updateProduct(id3,mapProduct);
                    break;
                case 4:
                    System.out.println("\n--------------------------------");
                    System.out.println("        How do you search?        ");
                    System.out.println("1: Search by type product         ");
                    System.out.println("2: Search by date(DD-MM-YY)       ");
                    System.out.println("3: Search In the price range      ");     
                    System.out.println("4: Search by name product         ");
                    System.out.println("5: Exit                           ");
                    System.out.println("\n--------------------------------");  
                    System.out.println("Enter your choice");
                    int typeSearch= inputTools.input.nextInt();
                    switch (typeSearch){
                        case 1:
                            System.out.println("\nInput type: ");
                            String type = new Scanner(System.in).nextLine();
                            searchAction.searchByType(type, mapProduct);
                            break;
                        case 2:
                            System.out.println("\nFrom: ");
                            String from= new Scanner(System.in).nextLine();
                            Date fromDate = convertTime.stringToDate(from);
                            System.out.println("\nTo: ");
                            String to= new Scanner(System.in).nextLine();
                            Date toDate = convertTime.stringToDate(to);
                            searchAction.searchInDateRangeEnter(fromDate, toDate, mapProduct);
                            break;
                        case 3:
                            System.out.println("\nFrom: ");
                            double fromPrice = new Scanner(System.in).nextDouble();
                            System.out.println("\nTo: ");
                            double toPrice = new Scanner(System.in).nextDouble();
                            searchAction.searchInPriceRange(fromPrice, toPrice, mapProduct);
                            break;
                        case 4:
                            System.out.println("\nInput name: ");
                            String name = new Scanner(System.in).nextLine();
                            searchAction.searchByName(name, mapProduct);
                            break;
                        case 5:
                            System.out.println("\nExit");
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("\n----------------------");
                    System.out.println("        Sort           ");
                    System.out.println("1: Sort by Price       ");
                    System.out.println("2: Sort by Date        ");
                    System.out.println("3: Sort by ID          ");
                    System.out.println("4: Sort by Type & Day  ");
                    System.out.println("5: Sort by Type & price");
                    System.out.println("\n---------------------");
                    System.out.println("Enter your choice");
                    int select2= inputTools.input.nextInt();
                    switch (select2){
                        case 1:
                        System.out.println("\n---------------------");
                        System.out.println("     Sort by price     ");
                        System.out.println("1: Sort decrease       ");
                        System.out.println("2: Sort increase       ");
                        System.out.println("\n---------------------");
                        System.out.println("Enter your choice      ");
                        int select3 = inputTools.input.nextInt();
                            switch(select3){
                                case 1: 
                                    sortAction.sortByPriceDecrease(mapProduct);
                                    break;
                                case 2:
                                    sortAction.sortByPriceIncrease(mapProduct);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("\n-------------------");
                            System.out.println("     Sort by date    ");
                            System.out.println("1: Sort decrease     ");
                            System.out.println("2: Sort increase     ");
                            System.out.println("\n-------------------");
                            System.out.println("Enter your choice    ");
                            int select4 = inputTools.input.nextInt();
                            switch(select4){
                                case 1: 
                                    sortAction.sortInputdayDecrease(mapProduct);
                                    break;
                                case 2:
                                    sortAction. sortInputdayIncrease(mapProduct);
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("\n-------------------");
                            System.out.println("     Sort by ID      ");
                            System.out.println("1: Sort decrease     ");
                            System.out.println("2: Sort increase     ");
                            System.out.println("\n-------------------");
                            System.out.println("Enter your choice    ");
                            int select5 = inputTools.input.nextInt();
                            switch(select5){
                                case 1: 
                                    sortAction.sortByIdDecrease(mapProduct);
                                    break;
                                case 2:
                                    sortAction.sortByIdIncrease(mapProduct);
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("");
                            sortAction.sortByTypeAndInputDay(mapProduct);
                            break;
                        case 5:
                            System.out.println("");
                            sortAction.sortByTypeAndPrice(mapProduct);
                            break;
                        default:
                            break;
                    }
                    break;
                case 6:
                    dataToFiles.readFile();
                    System.out.println("");
                    statistical.total(mapProduct);
                    statistical.productsExpired(mapProduct);
                    statistical.totalProducts(mapProduct);
                    break;
                case 7:
                    System.out.println("\n--------------------");
                    System.out.println("        Export        ");
                    System.out.println("1: Export all products");
                    System.out.println("2: Export by Type     ");
                    System.out.println("\n--------------------");
                    System.out.println("Enter your choice     ");
                    int select6 = inputTools.input.nextInt();
                    switch (select6){
                        case 1:
                            export.exportAll(mapProduct);
                            dataToFiles.deleteFile();
                            System.out.println("\nExport success");
                            break;
                        case 2:
                        	System.out.println("input type");
                        	String type = new Scanner(System.in).next();
                        	export.exportByType(mapProduct,type);
                        	System.out.println("Export successs !!");
                            break; 
                    }
                    break;
                case 8:
                    System.out.println("\nExit program");
                    dataToFiles.saveFile(mapProduct);
                    return;
                default:
                    System.out.println("\nPlease enter again");
                    break;
            }
        }
    }
}
