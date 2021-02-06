package fundamentals.oop2;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    /**
     * Implement all the classes with methods and fields necessary for the following scenario:
     * A store has to sell multiple products:
     * A product is defined by: name, price, expiration date.
     * The price of the product can be change but only with a difference of max 14% of the original price.
     * The store can inform the seller with the following informations if he asks for them:
     * which is the list of products with price bigger than a specified price
     * which is the list of products that have a the expiration date the next day
     * the expiration date of the product with a certain name
     * all the names of the products that have already expired
     * The seller can also:
     * modify the price of all the products from the store that have 30 days until the expiration date by reducing the price with 15%
     * rename  a specific product that has a certain name, from the list
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Enter the number of products from the store: ");
        int nrOfProducts = input.nextInt();

        Product[] myArray = new Product[nrOfProducts];

        for (int i = 0; i < nrOfProducts; i++) {
            if (i == 0) {
                myArray[i] =new Product ("Faina", 2.6f, "06.07.2021");
                continue;
            }
            if (i == 1) {
                myArray[i] =new Product ("Lapte", 5.4f, "08.03.2021");
                continue;
            }
            if (i == 2) {
                myArray[i] =new Product ("Cafea", 51.2f, "10.10.2020");
                continue;
            }
            System.out.print("Enter the name of the new product: ");
            String newName = input.next();
            System.out.print("Enter the price of the new product: ");
            float newPrice = input.nextFloat();
            System.out.print("Enter expiration date of the new product: ");
            String newDate = input.next();
         //   LocalDate newDate = LocalDate.parse(text, dateFormat);
            myArray[i] =new Product (newName, newPrice, newDate);
        }

        Store store = new Store(myArray);

        System.out.println("The list of products: ");
        store.listOfStoreProducts();

        System.out.print("Enter the minimum price for products: ");
        float min = input.nextFloat();
        store.listOfBiggerThanSpecifPriceProd(min);

        store.expDateNextDay();

        System.out.print("Enter the name of the product you want to find the expiration day: ");
        String prodToFind = input.next();
        store.expDateOfProduct(prodToFind);

        store.expiredProducts();

        store.modifPriceByExpDate();

        System.out.print("Enter the name of product you want to change: ");
        String oldName = input.next();
        System.out.print("Enter new name for product: ");
        String newName = input.next();
        store.renameProduct(oldName,newName);


//System.out.println("Duration:" + Duration.between(LocalDateTime.now(),LocalDateTime.now().plusDays(100)).toDays());
        //Output: 100

//        System.out.println(store.getListOfProducts()[2].getName());
//        System.out.println(myArray[2].getName());
    }
}
