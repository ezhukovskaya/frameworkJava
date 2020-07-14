package application.utils;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class MenuOperationUtils {
    private static Map<String, Integer> menuItems = new HashMap<>();
    @Getter @Setter private static String name;
    @Getter @Setter private static int price;

    public static void addItem(){
        menuItems.put(name,price);
    }

    public static boolean isItemExists(String name){
        return menuItems.containsKey(name);
    }

}
