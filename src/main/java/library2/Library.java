package library2;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of authors (>=3): ");
        int n = input.nextInt();

        Poem[] poemArray = new Poem[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                Author newAuthor = new Author();
                Poem newPoem = new Poem();
                newPoem.creator = newAuthor.addAuthor("Eminescu","romanian");
                poemArray[i] = newPoem;
            }
            else if (i == 1) {
                Author newAuthor = new Author();
                Poem newPoem = new Poem();
                newPoem.creator = newAuthor.addAuthor("Milton","english");
                poemArray[i] = newPoem;
            }
            else if (i == 2) {
                Author newAuthor = new Author();
                Poem newPoem = new Poem();
                newPoem.creator = newAuthor.addAuthor("Schlegel","german");
                poemArray[i] = newPoem;
            }
            else {
                Author newAuthor = new Author();
                System.out.println("New author's surname: ");
                String newName = input.next();
                System.out.println("New author's nationality: ");
                String newNat = input.next();
                Poem newPoem = new Poem();
                newPoem.creator = newAuthor.addAuthor(newName,newNat);
                poemArray[i] = newPoem;
            }
        }
        System.out.println("The authors: ");
        int maxStrophenumber = 0;
        int index = 0;
        for (int i = 0; i < poemArray.length; i++) {
            System.out.println((i + 1) + ". " + poemArray[i].creator.surname + " - " + poemArray[i].creator.nationality);
            System.out.println("Enter strophenumbers: ");
            poemArray[i].stropheNumbers = input.nextInt();
            if (poemArray[i].stropheNumbers > maxStrophenumber) {
                maxStrophenumber = poemArray[i].stropheNumbers;
                index = i;
            }
        }
        System.out.println("The author who wrote the longest poem is " + poemArray[index].creator.surname + ".");
    }
}
