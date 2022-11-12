package com.company;

import com.company.ShawermaAddons.*;
import com.company.ShawermaTypes.*;

public class Order {

    private Order() {
    }
    
    public static void makeOrder(String str) {
        Logger logger = Logger.getInstance();
        BaseShawerma shawerma = null;

        String[] list = str.split(" ");

        for (int i = 0; i < list.length; i++) {
            switch (list[i].toLowerCase()) {
                case "cheese":
                    shawerma = new Cheese(shawerma);
                    break;
                case "chicken":
                    shawerma = new ChickenShawerma();
                    break;
                case "meat":
                    shawerma = new MeatShawerma();
                    break;
                case "cocktail":
                    shawerma = new Cocktail(shawerma);
                    break;
                case "ketchup":
                    shawerma = new Ketchup(shawerma);
                    break;
                case "garlic":
                    shawerma = new Garlic(shawerma);
                    break;
                case "pickles":
                    shawerma = new Pickles(shawerma);
                    break;
                case "tahini":
                    shawerma = new Tahini(shawerma);
                    break;
            }
        }

        System.out.println("\n\tshawerma type is: " + shawerma.getShawermaType() + ". \n\tAddons are    : " + shawerma.getAddOns());
        logger.write("\n\tshawerma type is: " + shawerma.getShawermaType() + ". \n\tAddons are    :" + shawerma.getAddOns());
    }
    
}
