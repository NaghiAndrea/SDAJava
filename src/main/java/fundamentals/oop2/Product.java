package fundamentals.oop2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *  A product is defined by: name, price, expiration date.
 *  The price of the product can be change but only with a difference of max 14% of the original price.
 */

public class Product {
    private String name;
    private float price;
    private LocalDate expDate;

    public Product (String name, float price, String expDate){
        this.name = name;
        this.price = price;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        this.expDate = LocalDate.parse(expDate, dateFormat);
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    //The price of the product can be change but only with a difference of max 14% of the original price.
    public void setPrice(float price) {

        if (Math.abs(price) > this.price*0.14){
            System.out.println("Error: The price can be changed with max. 14%: " + this.price*0.14);
            return;
        }
        this.price += price;
        System.out.println("New price of " + getName() + ": " + this.price);
    }

    public void setPrice30DaysToExpire(float price){
        this.price += price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
