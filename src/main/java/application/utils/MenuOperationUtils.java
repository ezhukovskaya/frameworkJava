package application.utils;

import application.constants.StringConstants;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class MenuOperationUtils {
    private static Map<String, Integer> menuItems = new HashMap<>();
    @Getter @Setter private static String name;
    @Getter @Setter private static int price;

    public static void addItem(){
        if(isItemExists(name)){
            throw new IllegalArgumentException(StringConstants.DUPLICATE_ITEM);
        }
        menuItems.put(name,price);
    }

    public static boolean isItemExists(String name){
        return menuItems.containsKey(name);
    }

}
