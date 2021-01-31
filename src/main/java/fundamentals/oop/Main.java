package fundamentals.oop;

import java.util.Currency;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount bankAccount = new BankAccount();
        System.out.println("Type: " + bankAccount.getType());
        System.out.println("Currency: " + bankAccount.getCurrency());
        //case 1: give bank account to the client from outside (created outside)


        Client client = new Client("Larisa", "1233466666", bankAccount);
        System.out.println(client.toString());
        System.out.println(client); // afiseaza acelasi lucru

        //  client.getBankAccount().setBalance(12);
        client.getBankAccount().addMoney(15);
        System.out.println(client);
        client.getBankAccount().setType("SPENDING");
        client.getBankAccount().addMoney(1);
        client.getBankAccount().addMoney(27);
        System.out.println(client);
        client.getBankAccount().setType("SAVING");
        client.getBankAccount().withdrawMoney(40);
        System.out.println(client);
        client.getBankAccount().withdrawMoney(15);
        System.out.println(client);


        System.out.println("Rezultatul convertirii: " + BankAccount.convertMoneyToCurrency(10, "EUR", "USD"));
        //sau
        double x = BankAccount.convertMoneyToCurrency(20, "EUR", "USD");
        System.out.println("Rezultatul convertirii: " + x);

        //Sa cream inca 2 conturi
        BankAccount bankAccount1 = new BankAccount("SAVING", "USD;"); //ctrl+d
        BankAccount bankAccount2 = new BankAccount("SPENDING", "USD;"); //ctrl+d
        BankAccount[] myArray = {bankAccount1,bankAccount2};
        client.setBankAccountArray(myArray);
        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println("Array-ul: " + client.getBankAccountArray()[0]);  //ctrl+click arata metoda
        //aici trebuie sa returneze un array de BankAccount
        System.out.println("Array-ul: " + client.getBankAccountArray()[0].getType());


        BankAccount[] clientBankAccounts = client.getBankAccountArray();
        System.out.println(clientBankAccounts[0]);
        System.out.println(client.getBankAccountArray()[0]); //acelasi lucru doar nu am creat inca un obiect intr-o variabila
        //ca sa pot sa listez

/*
        System.out.println("Input new name: ");
        String newName  = scanner.nextLine();
        System.out.println("Input cnp: ");
        String newCnp = scanner.nextLine();
        //case 2: client has assigned by default a default bank account  - create the bank account inside the constructor
        Client client2 = new Client(newName,newCnp);
        System.out.println(client2);
*/

    }
}


