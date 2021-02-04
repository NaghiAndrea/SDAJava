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
        //System.out.println("1. --- " + client.toString1());
        //System.out.println("2. --- " + client); // afiseaza acelasi lucru cu to  string- dar aici s-a facut overwright
/*
        //  client.getBankAccount().setBalance(12);  setam balance-ul din bankAccountul clientului
        //am sters setbalance pt ca era o prtita de scapare
        //  System.out.println(client);
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
        client.getBankAccount().addMoney(32);
        System.out.println(client);

        //Afisare rezultat convertire apeland direct metoda
        System.out.println("Rezultatul convertirii: " + BankAccount.convertMoneyToCurrency(10, "EUR", "USD"));
        //sau Afisare rezultat convertire stocand intr-o variabila rezultatul convertirii
        double x = BankAccount.convertMoneyToCurrency(20, "EUR", "USD");
        System.out.println("Rezultatul convertirii: " + x);


        //convertire balance din cont usd un cont eur - dar nu functioneaza corect pt ca nu mai avem setbalance,si
        //cu addmoney se mai adauga la balance suma convertita.
        //  client.getBankAccount().addMoney(BankAccount.convertMoneyToCurrency(client.getBankAccount().getBalance(),
        // client.getBankAccount().getCurrency(),"EUR"));
        // System.out.println(client);


        //Sa cream inca 2 conturi
        BankAccount bankAccount1 = new BankAccount("SAVING", "USD;"); //ctrl+d
        BankAccount bankAccount2 = new BankAccount("SPENDING", "USD;"); //ctrl+d
        BankAccount[] myArray = {bankAccount1, bankAccount2};
        client.setBankAccountArray(myArray);
        System.out.println("7. --- " + myArray[0]);
        System.out.println("8. --- " + myArray[1]);
        System.out.println("9. ---- Array-ul: " + client.getBankAccountArray()[0]);  //ctrl+click arata metoda
        //aici trebuie sa returneze un array de BankAccount
        System.out.println("10. ---- Array-ul: " + client.getBankAccountArray()[0].getType());

        BankAccount[] clientBankAccounts = client.getBankAccountArray();
        System.out.println("11. --- " + clientBankAccounts[0]);
        System.out.println("12. --- " + client.getBankAccountArray()[0]); //acelasi lucru doar nu am creat
        // inca un obiect intr-o variabila ca sa pot sa listez

        System.out.println("13. --- Clientul: " + client);
*/
        //============
        BankAccount bankAccount3 = new BankAccount("SPENDING", "USD;"); //ctrl+d
        BankAccount bankAccount4 = new BankAccount("SPENDING", "USD;"); //ctrl+d
        BankAccount[] myAccounts = {bankAccount3, bankAccount4};

        client.setBankAccountArray(myAccounts);
        System.out.println("Datele clientului: " + client);
        System.out.print("\nEnter the type of new banking account (SAVING / SPENDING): ");
        String newType = scanner.next();
        System.out.print("Enter the currency of new banking account (EUR / USD): ");
        String newCurrency = scanner.next();
        BankAccount newBankAccount = new BankAccount(newType, newCurrency);

        client.addBankAccount(newBankAccount);
        System.out.println("\nDatele actualizate ale clientului: " + client);

        System.out.println("Contul SAVING al clientului: " + client.getSavingAccount());

        System.out.print("\nEnter the type of the banking account you wish to remove (SAVING / SPENDING): ");
        newType = scanner.next();
        client.removeAccountByType(newType);

        System.out.println("\nDatele clientului:" + client);

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


