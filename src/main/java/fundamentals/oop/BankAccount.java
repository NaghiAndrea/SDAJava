package fundamentals.oop;

/**
 * BankAccount which is consists of:
 * constructor: with arguments: type and currency ( for initializing the fields and the  balance will be initialized
 * with 0 in the constructor)
 * fields: type of the account (SAVING or SPENDING),  balance ( the amount of money), currency ( USD, EUR),
 * methods:
 * addMoney ( adds money to the balance, - if the account is of type SPENDING the amount of money that is added needs
 * to be bigger than 10% of balance otherwise print a suggestive  error message)
 * withdrawMoney ( withdraws  money from the balance - if the account is of type SAVING the remaining balance
 * can not be < 0 otherwise print a suggestive  error message ),
 * covertMoneyToCurrency ( that takes 2 arrguments: amountOfMoney to convert, and the currency to convert to and
 * returns the result = the money in the input currency)
 */

public class BankAccount {
    /**
     * Type of the account: SAVING or SPENDING
     */
    private String type;
    /**
     * Balance of the account
     */
    private double balance;
    /**
     * Currency: USD or EUR
     */
    private String currency;

    public static final double USD_TO_EUR = 0.85;  //caps cu _ intre cuvinte - la constante
    public static final double EUR_TO_USD = 1.25;

    public BankAccount(String type, String currency) {
        this.type = type;
        this.currency = currency;
        this.balance = 0;
    }

    public BankAccount() {
        this.type = "SAVING";
        this.currency = "USD";
        this.balance = 0;
    }

    public void addMoney(double newMoney) {
        if (this.type == "SPENDING" && newMoney <= this.balance / 10) {
            System.out.println("Please add at least 10% of actual balance: ");
            return;
        }
        this.balance += newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    public void withdrawMoney(double newMoney) {
        if (this.type == "SAVING" && this.balance - newMoney < 0) {
            System.out.println("Your balance can't be negative!");
            return;
        }
        this.balance -= newMoney;
        System.out.println("Your new balance is: " + this.balance);
    }

    public static double convertMoneyToCurrency(double amountOfMoney, String inputCurrency, String outputCurrency) {
        //l-am facut static ca sa putem apela din main direct din clasa - ex.daca omul nu are cont deci nu se face
        //convertirea in cont ci direct la casa - si nu avem obiectul cont creat - se apeleaza direct convertirea
        //

        if (inputCurrency.equals("EUR") && outputCurrency.equals("USD")) {
            return amountOfMoney * EUR_TO_USD;
        }
        return amountOfMoney * USD_TO_EUR;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "type='" + type + '\'' +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                '}';
    }

/* facut de noi:
    public String toString() {
        return "Account type: " + this.type + " / Currency: " + this.currency + " / Balance: " + this.balance;
    }
*/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Return the ballance of the account
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /* stergem acest setter pt ca daca punem alt balance tr sa verifice sa fie mai mare ca 10%
        public void setBalance(double balance) {
            this.balance = balance;
        }
    */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
