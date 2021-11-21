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

    public void showMenu() throws ParseException {
        while(true){
            System.out.println("--------------------");
            System.out.println("        Menu        ");
            System.out.println("1: Add element      ");
            System.out.println("2: Delete element   ");
            System.out.println("3: Update element   ");
            System.out.println("4: Search element   ");
            System.out.println("5: Sort element     ");
            System.out.println("6: Statistic     ");
            System.out.println("7: Exit             ");
            System.out.println("--------------------");
            System.out.println("Enter your choice:  ");
            System.out.println("                    ");
            choose = inputTools.input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("        Menu        ");
                    System.out.println("1: Food      ");
                    System.out.println("2: Ceramic   ");
                    System.out.println("3: Electrical   ");
                    System.out.println("--------------------");
                    System.out.println("Enter your choice:  ");
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
                            return;
                    }
                    break;
                case 2:
                    System.out.println("Input ID product: ");
                    String id = new Scanner(System.in).nextLine();
                    System.out.println(commonCRUD.deleteProduct(id, mapProduct));
                    break;
                case 3:
                    System.out.println("Input ID product: ");
                    String id3 = new Scanner(System.in).nextLine();
                    commonCRUD.updateProduct(id3, mapProduct);
                    break;
                case 4:
                    System.out.println("        How do you search?        ");
                    System.out.println("1: Type product     ");
                    System.out.println("2: Date(dd-MM-yyyy)   ");
                    System.out.println("3: in the price range   ");
                    int typeSearch= inputTools.input.nextInt();

                    switch (typeSearch){
                        case 1:
                            System.out.println("Input type: ");
                            String type= inputTools.input.nextLine();
                            searchAction.searchBy(type, mapProduct);
                            break;
                        case 2:
                            System.out.println("From: ");
                            String from= new Scanner(System.in).nextLine();
                            Date fromDate = convertTime.stringToDate(from);
                            System.out.println("To: ");
                            String to= new Scanner(System.in).nextLine();
                            Date toDate = convertTime.stringToDate(to);
                            System.out.println(searchAction.searchBy(fromDate, toDate, mapProduct));
                            break;
                        case 3:
                            System.out.println("From: ");
                            double fromPrice = new Scanner(System.in).nextDouble();
                            System.out.println("To: ");
                            double toPrice = new Scanner(System.in).nextDouble();
                            searchAction.searchBy(fromPrice, toPrice, mapProduct);
                        default:
                            return;
                    }
                     break;
                case 5:
                    System.out.println("        Sort by        ");
                    System.out.println("1: Price      ");
                    System.out.println("2: Date & Type  ");
                    System.out.println("3: Price & Type  ");
                    int select5= inputTools.input.nextInt();

                    switch (select5){
                        case 1:
                            sortAction.sortBy(mapProduct);
                            break;
                        case 2:
                            sortAction.multipleFilter(mapProduct, select5);
                            break;
                        case 3:
                            sortAction.filterBy(mapProduct, select5);
                        default:
                            return;
                    }
                    return;
                case 6:
                    System.out.println(mapProduct);
                    break;
                case 7:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Enter again");
                    return;
            }
        }
    }
}
