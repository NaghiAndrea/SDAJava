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
        System.out.println("1. --- " + client.toString1());
        System.out.println("2. --- " + client); // afiseaza acelasi lucru cu to  string- dar aici s-a facut overwright

        //  client.getBankAccount().setBalance(12);
        client.getBankAccount().addMoney(15);
        System.out.println("3. --- " + client);
        client.getBankAccount().setType("SPENDING");
        client.getBankAccount().addMoney(1);
        client.getBankAccount().addMoney(27);
        System.out.println("4. --- " + client);
        client.getBankAccount().setType("SAVING");
        client.getBankAccount().withdrawMoney(40);
        System.out.println("5. ---- " + client);
        client.getBankAccount().withdrawMoney(15);
        System.out.println("6. --- " + client);


        System.out.println("Rezultatul convertirii: " + BankAccount.convertMoneyToCurrency(10, "EUR", "USD"));
        //sau
        double x = BankAccount.convertMoneyToCurrency(20, "EUR", "USD");
        System.out.println("Rezultatul convertirii: " + x);

        //Sa cream inca 2 conturi
        BankAccount bankAccount1 = new BankAccount("SAVING", "USD;"); //ctrl+d
        BankAccount bankAccount2 = new BankAccount("SPENDING", "USD;"); //ctrl+d
        BankAccount[] myArray = {bankAccount1,bankAccount2};
        client.setBankAccountArray(myArray);
        System.out.println("7. --- " + myArray[0]);
        System.out.println("8. --- " + myArray[1]);
        System.out.println("9. ---- Array-ul: " + client.getBankAccountArray()[0]);  //ctrl+click arata metoda
        //aici trebuie sa returneze un array de BankAccount
        System.out.println("10. ---- Array-ul: " + client.getBankAccountArray()[0].getType());


        BankAccount[] clientBankAccounts = client.getBankAccountArray();
        System.out.println("11. --- " + clientBankAccounts[0]);
        System.out.println("12. --- " + client.getBankAccountArray()[0]); //acelasi lucru doar nu am creat inca un obiect intr-o variabila
        //ca sa pot sa listez

        System.out.println("13. --- Clientul: " + client);

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


