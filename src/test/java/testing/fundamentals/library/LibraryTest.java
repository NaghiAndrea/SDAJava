package testing.fundamentals.library;

import org.junit.jupiter.api.Test;
import testing.fundamentals.ArrayStringsExercises;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.not;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void shouldReturnNumOfBooksOfSpecifAuthor(){
        //Given
        Book book1 = new Book("Mihai Eminescu", "1883", "Luceafarul");
        Book book2 = new Book("Ion Creanga", "1892", "Amintiri din copilarie");
        Book book6 = new Book("Ion Creanga", "1992", "Amintiri din copilarie2");
        Book book7 = new Book("Mihai Eminescu", "1983", "Luceafarul3");

        Book[] bookArray =  {book1,book2,book6,book7};
        Library library = new Library(bookArray);

        String inputString = "Ion Creanga";
        String expectedResult = "Ion Creanga has 2 book / books in the library";

        //When
        String actualString = library.getNumOfBooksBySpecifAuthor(inputString);
        //Then
        assertEquals(expectedResult, actualString);
        assertThat(expectedResult).isEqualTo(actualString);
    }

    void shouldReturnEmptyLibrary(){
        //Given
        Book[] bookArray =  {};
        Library library = new Library(bookArray);
        String inputString = "Ion Creanga";
        String expectedResult = "The library is empty.";
        //When
        String actualString = library.getNumOfBooksBySpecifAuthor(inputString);
        //Then
        assertEquals(expectedResult, actualString);
        assertThat(expectedResult).isEqualTo(actualString);
    }

    @Test
    void shouldReturnNumOfBooksBetween2years() {
        //Given
        Book book1 = new Book("Mihai Eminescu", "1883", "Luceafarul");
        Book book2 = new Book("Ion Creanga", "1892", "Amintiri din copilarie");
        Book book6 = new Book("Ion Creanga", "1992", "Amintiri din copilarie2");
        Book book7 = new Book("Mihai Eminescu", "1983", "Luceafarul3");

        Book[] bookArray = {book1, book2, book6, book7};
        Library library = new Library(bookArray);

        String inputDateMin = "01.01.1850";
        String inputDateMax = "31.12.1893";

        String expectedResult = "2 books has the year of publication between 01.01.1850-31.12.1893";

        //When
        String actualString = library.getNumOfBooksBetweenToYears(inputDateMin,inputDateMax);
        //Then
        assertEquals(expectedResult, actualString);
        assertThat(expectedResult).isEqualTo(actualString);
    }

    @Test
    void shouldReturnMsgForEmptyLibrary() {
        //Given
        Book[] bookArray =  {};
        Library library = new Library(bookArray);

        String inputDateMin = "01.01.1950";
        String inputDateMax = "31.12.1993";

        String expectedResult = "The library is empty.";
        //When
        String actualString = library.getNumOfBooksBetweenToYears(inputDateMin,inputDateMax);
        //Then
        assertEquals(expectedResult, actualString);
        assertThat(expectedResult).isEqualTo(actualString);
    }
    @Test
    void shouldReturnMsgForDateMinBiggerThanDateMAx() {
        //Given
        Book book1 = new Book("Mihai Eminescu", "1883", "Luceafarul");
        Book book2 = new Book("Ion Creanga", "1892", "Amintiri din copilarie");
        Book book6 = new Book("Ion Creanga", "1992", "Amintiri din copilarie2");
        Book book7 = new Book("Mihai Eminescu", "1983", "Luceafarul3");
        Book[] bookArray = {book1, book2, book6, book7};
        Library library = new Library(bookArray);

        String inputDateMin = "01.01.1950";
        String inputDateMax = "31.12.1893";

        String expectedResult = "The beginning of the entered period is after the end of period.";
        //When
        String actualString = library.getNumOfBooksBetweenToYears(inputDateMin,inputDateMax);
        //Then
        assertEquals(expectedResult, actualString);
        assertThat(expectedResult).isEqualTo(actualString);
    }

    @Test
    void shouldReturnAuthorOfSpecifBook(){
        //Given
        Book book1 = new Book("Mihai Eminescu", "1883", "Luceafarul");
        Book book2 = new Book("Ion Creanga", "1892", "Amintiri din copilarie");
        Book book6 = new Book("Ion Creanga", "1992", "Amintiri din copilarie2");
        Book book7 = new Book("Mihai Eminescu", "1983", "Luceafarul3");

        Book[] bookArray =  {book1,book2,book6,book7};
        Library library = new Library(bookArray);

        String inputString = "Luceafarul3";
        String expectedResult = "Mihai Eminescu";

        //When
        String actualString = library.getAuthorOfSpecifBook(inputString);
        //Then
        assertEquals(expectedResult, actualString);
        assertThat(expectedResult).isEqualTo(actualString);
    }

    @Test
    void shouldRetMsgEmptyLibraryAuthorOfSpecifBook(){
        //Given
        Book[] bookArray =  {};
        Library library = new Library(bookArray);

        String inputString = "Luceafarul3";
        String expectedResult = "The library is empty.";

        //When
        String actualString = library.getAuthorOfSpecifBook(inputString);
        //Then
        assertEquals(expectedResult, actualString);
        assertThat(expectedResult).isEqualTo(actualString);
    }

    @Test
    void shouldRetMsgForNotFound(){
        //Given
        Book book1 = new Book("Mihai Eminescu", "1883", "Luceafarul");
        Book book2 = new Book("Ion Creanga", "1892", "Amintiri din copilarie");
        Book book6 = new Book("Ion Creanga", "1992", "Amintiri din copilarie2");
        Book book7 = new Book("Mihai Eminescu", "1983", "Luceafarul3");

        Book[] bookArray =  {book1,book2,book6,book7};
        Library library = new Library(bookArray);

        String inputString = "Luceafarul4";
        String expectedResult = "The book is not in the library.";

        //When
        String actualString = library.getAuthorOfSpecifBook(inputString);
        //Then
        assertEquals(expectedResult, actualString);
        assertThat(expectedResult).isEqualTo(actualString);
    }

}