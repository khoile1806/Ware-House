package quanlykhohang.model.entities;

import quanlykhohang.inputTools;
import quanlykhohang.model.CommonCRUD;
import quanlykhohang.model.SearchAction;
import quanlykhohang.model.SortAction;
import quanlykhohang.utils.ConvertTime;

import java.text.ParseException;
import java.util.*;

public class Menu {
    Map<String, Product> mapProduct = new HashMap<>();
    int choose;
    ConvertTime convertTime= new ConvertTime();
    CommonCRUD commonCRUD = new CommonCRUD();
    SearchAction searchAction = new SearchAction();
    SortAction sortAction = new SortAction();

    public void showMenu() throws ParseException, InterruptedException {
        while(true){
            System.out.println("--------------------");
            System.out.println("        Menu        ");
            System.out.println("1: Add element      ");
            System.out.println("2: Delete element   ");
            System.out.println("3: Update element   ");
            System.out.println("4: Search element   ");
            System.out.println("5: Sort element     ");
            System.out.println("6: Statistic        ");
            System.out.println("7: Exit             ");
            System.out.println("--------------------");
            System.out.println("Enter your choice:  ");
            System.out.println("                    ");
            choose = inputTools.input.nextInt();
            System.out.println("");
            switch (choose){
                case 1:
                    System.out.println("---------------------");
                    System.out.println("        Menu         ");
                    System.out.println("1: Food              ");
                    System.out.println("2: Ceramic           ");
                    System.out.println("3: Electrical        ");
                    System.out.println("---------------------");
                    System.out.println("Enter your choice:   ");
                    int select = inputTools.input.nextInt();
                    System.out.println("");
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
                    System.out.println("");
                    System.out.println("Input ID product: ");
                    String id = new Scanner(System.in).nextLine();
                    System.out.println(commonCRUD.deleteProduct(id, mapProduct));
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Input ID product: ");
                    String id3 = new Scanner(System.in).nextLine();
                    commonCRUD.updateProduct(id3,mapProduct);
                    break;
                case 4:
                    System.out.println("----------------------------------");
                    System.out.println("        How do you search?        ");
                    System.out.println("1: Search by type product         ");
                    System.out.println("2: Search by date(DD-MM-YY)       S");
                    System.out.println("3: Search In the price range      ");     
                    System.out.println("4: Search by name product         ");
                    System.out.println("5: Exit                           ");
                    System.out.println("----------------------------------");  
                    System.out.println("Enter your choice");
                    int typeSearch= inputTools.input.nextInt();
                    System.out.println("");
                    switch (typeSearch){
                        case 1:
                            System.out.println("Input type: ");
                            typeSearch= inputTools.input.nextInt();
                            String type= inputTools.input.nextLine();
                            searchAction.searchByType(type, mapProduct);
                            break;
                        case 2:
                            System.out.println("From: ");
                            String from= new Scanner(System.in).nextLine();
                            Date fromDate = convertTime.stringToDate(from);
                            System.out.println("To: ");
                            String to= new Scanner(System.in).nextLine();
                            Date toDate = convertTime.stringToDate(to);
                            searchAction.searchInDateRangeEnter(fromDate, toDate, mapProduct);
                            break;
                        case 3:
                            System.out.println("From: ");
                            double fromPrice = new Scanner(System.in).nextDouble();
                            System.out.println("To: ");
                            double toPrice = new Scanner(System.in).nextDouble();
                            searchAction.searchInPriceRange(fromPrice, toPrice, mapProduct);
                            break;
                        case 4:
                            System.out.println("Input name: ");
                            String name = new Scanner(System.in).nextLine();
                            searchAction.searchByName(name, mapProduct);
                            break;
                        case 5:
                            System.out.println("Exit");
                            break;
                        default:
                            break;
                    }
                    break;
                case 5:
                    System.out.println("-----------------------");
                    System.out.println("        Sort           ");
                    System.out.println("1: Sort by Price       ");
                    System.out.println("2: Sort by Date        ");
                    System.out.println("3: Sort by ID          ");
                    System.out.println("4: Sort by Type & Day  ");
                    System.out.println("5: Sort by Type & price");
                    System.out.println("-----------------------");
                    System.out.println("Enter your choice");
                    int select2= inputTools.input.nextInt();
                    System.out.println("");
                    switch (select2){
                        case 1:
                        System.out.println("-----------------------");
                        System.out.println("     Sort by price     ");
                        System.out.println("1: Sort decrease       ");
                        System.out.println("2: Sort increase       ");
                        System.out.println("-----------------------");
                        System.out.println("Enter your choice      ");
                        int select3 = inputTools.input.nextInt();
                        System.out.println("");
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
                            System.out.println("---------------------");
                            System.out.println("     Sort by date    ");
                            System.out.println("1: Sort decrease     ");
                            System.out.println("2: Sort increase     ");
                            System.out.println("---------------------");
                            System.out.println("Enter your choice    ");
                            int select4 = inputTools.input.nextInt();
                            System.out.println("");
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
                            System.out.println("---------------------");
                            System.out.println("     Sort by ID      ");
                            System.out.println("1: Sort decrease     ");
                            System.out.println("2: Sort increase     ");
                            System.out.println("---------------------");
                            System.out.println("Enter your choice    ");
                            int select5 = inputTools.input.nextInt();
                            System.out.println("");
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
                    System.out.println("");
                    Statistical.total(mapProduct);
                    Statistical.toltalProducts(mapProduct);
                    break;
                case 7:
                    System.out.println("");
                    System.out.println("Exit program");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Please enter again");
                    break;
            }
        }
    }
}
