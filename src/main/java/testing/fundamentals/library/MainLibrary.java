package testing.fundamentals.library;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class MainLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book book1 = new Book("Mihai Eminescu", "1883", "Luceafarul");
        Book book2 = new Book("Ion Creanga", "1892", "Amintiri din copilarie");
        Book book3 = new Book("Vasile Alecsandri", "1852", "Balade");
        Book book4 = new Book("Ion Luca Caragiale", "1901", "Momente");
        Book book5 = new Book("Mihai Eminescu", "1888", "Luceafarul2");
        Book book6 = new Book("Ion Creanga", "1992", "Amintiri din copilarie2");
        Book book7 = new Book("Mihai Eminescu", "1983", "Luceafarul3");


        Book[] bookArray =  {book1,book2,book3,book4,book5,book6,book7};

        Library library = new Library(bookArray);

        System.out.println(library);

//        System.out.println("Enter the author: ");
//        String toFindAuthor = input.nextLine();
//        System.out.println(library.getNumOfBooksBySpecifAuthor(toFindAuthor));

        System.out.println(library.getNumOfBooksBySpecifAuthor("Ion Creanga"));

        System.out.println(library.getNumOfBooksBetweenToYears("01.01.1887", "25.06.1890"));

        System.out.println(library.getNumOfBooksBetweenToYears("01.02.1950","05.06.1878"));

        System.out.println(library.getAuthorOfSpecifBook("Momente"));

        System.out.println(library.getAuthorOfSpecifBook("Moments"));

    }
}
