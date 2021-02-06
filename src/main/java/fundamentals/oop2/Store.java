package fundamentals.oop2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * The store can inform the seller with the following informations if he asks for them:
 * * which is the list of products with price bigger than a specified price
 * * which is the list of products that have a the expiration date the next day
 * * the expiration date of the product with a certain name
 * * all the names of the products that have already expired
 * The seller can also:
 * * modify the price of all the products from the store that have 30 days until the expiration date by reducing the price with 15%
 * * rename  a specific product that has a certain name, from the list
 */
public class Store {
    private Product[] listOfProducts;

    public Store(Product[] listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public Product[] getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(Product[] listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public void listOfStoreProducts() {
        for (int i = 0; i < listOfProducts.length; i++) {
            System.out.println((i + 1) + ". Product name: " + listOfProducts[i].getName() + " -- Price: "
                    + listOfProducts[i].getPrice() + " lei -- Exp.Date: " + listOfProducts[i].getExpDate());
        }
    }

    //which is the list of products with price bigger than a specified price
    public void listOfBiggerThanSpecifPriceProd(float minPrice) {
        System.out.println("The list of products with price bigger than " + minPrice + ":");
        int count = 0;
        for (int i = 0; i < listOfProducts.length; i++) {
            if (listOfProducts[i].getPrice() > minPrice) {
                System.out.println((++count) + ". Product name: " + listOfProducts[i].getName() + " -- Price: "
                        + listOfProducts[i].getPrice() + " lei -- Exp.Date: " + listOfProducts[i].getExpDate());
            }
        }
        if (count == 0) {
            System.out.println("No product has bigger price than " + minPrice);
        }
    }

    //which is the list of products that have a the expiration date the next day
    public void expDateNextDay() {
        System.out.println("The list of products with expiration day tomorrow: ");
        LocalDate now = LocalDate.now();
        int count = 0;
        for (int i = 0; i < listOfProducts.length; i++) {
            Period nrOfDays = Period.between(now, listOfProducts[i].getExpDate());
            if (nrOfDays.getDays() == 1) {
                System.out.println((++count) + ". Product name: " + listOfProducts[i].getName() + " -- Price: "
                        + listOfProducts[i].getPrice() + " lei -- Exp.Date: " + listOfProducts[i].getExpDate());
            }
        }
        if (count == 0) {
            System.out.println("No product expires tomorow.");
        }
    }

    //the expiration date of the product with a certain name
    public void expDateOfProduct(String productName) {
        int i = 0;
        while (i < listOfProducts.length) {
            if (listOfProducts[i].getName().equals(productName)) {
                System.out.println("The expiration date of the " + listOfProducts[i].getName() + " is: " +
                        listOfProducts[i].getExpDate());
                return;
            }
            i++;
        }
        System.out.println("The product does not exist in the store.");
    }

    //    all the names of the products that have already expired
    public void expiredProducts() {
        System.out.println("The list of expired products: ");
        LocalDate now = LocalDate.now();
        int count = 0;
        for (int i = 0; i < listOfProducts.length; i++) {
            Period nrOfDays = Period.between(now, listOfProducts[i].getExpDate());
            if (nrOfDays.getDays() < 0) {
                System.out.println((++count) + ". Product name: " + listOfProducts[i].getName());
            }
        }
        if (count == 0) {
            System.out.println("No expired product.");
        }
    }

    //modify the price of all the products from the store that have 30 days until the expiration date by reducing the price with 15%
    public void modifPriceByExpDate() {
        System.out.println("The list of products that have 30 days until to expiration date (with new prices): ");
        LocalDate now = LocalDate.now();
        int count = 0;
        for (int i = 0; i < listOfProducts.length; i++) {
            Period nrOfDays = Period.between(now, listOfProducts[i].getExpDate());
//            System.out.println("Peste 30 zile: " + now.plusDays(30).getDayOfYear());
//            System.out.println(Period.between(now,now.plusDays(100)).getMonths());      //Output:3
//            System.out.println(Period.between(now,now.plusDays(100)).getDays());        //Output:11
//            System.out.println(nrOfDays.getDays());
//            System.out.println(nrOfDays.getMonths());
            if (now.plusDays(30).getDayOfYear() == listOfProducts[i].getExpDate().getDayOfYear()) {
                listOfProducts[i].setPrice30DaysToExpire(-listOfProducts[i].getPrice() * 0.15f);
                System.out.println((++count) + ". Product name: " + listOfProducts[i].getName() +
                        " -- Exp.Date: " + listOfProducts[i].getExpDate() + " -- New price: " +
                        listOfProducts[i].getPrice() + " lei");
            }
        }
        if (count == 0) {
            System.out.println("No product expires in 30 days.");
        }
    }

    public void renameProduct(String oldName, String newName) {
        int i = 0;
        boolean notFound = true;
        while (notFound && i < listOfProducts.length) {
            if (listOfProducts[i].getName().equals(oldName)) {
                listOfProducts[i].setName(newName);
                notFound = false;
            }
            i++;
        }
        if (notFound) {
            System.out.println("No product name matches with the given name.");
            return;
        }
        System.out.println("The renamed product details: ");
        System.out.println("Product name: " + listOfProducts[i-1].getName() + " -- Price: "
                + listOfProducts[i-1].getPrice() + " lei -- Exp.Date: " + listOfProducts[i-1].getExpDate());
    }
}
