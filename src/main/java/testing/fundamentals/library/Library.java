package testing.fundamentals.library;

import sun.security.util.ArrayUtil;

import java.util.Arrays;

public class Library {

    private Book[] listOfBooks;

    public Library(Book[] listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public Book[] getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(Book[] listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public int getIndexOfElement(Book theBook) {
        return Arrays.asList(listOfBooks).indexOf(theBook);
    }

    @Override
    public String toString() {
        return "Library{" +
                "listOfBooks=" + Arrays.toString(listOfBooks) +
                '}';
    }

    public String getNumOfBooksBySpecifAuthor(String authorName){
        if (this.listOfBooks.length == 0) return "The library is empty.";
        int count = 0;
        for (int i = 0; i < this.listOfBooks.length;i++) {
            if (this.listOfBooks[i].getAuthor().equals(authorName)){
                count++;
            }
        }
        return authorName  + " has " + count + " book / books in the library";
    }

    public String getNumOfBooksBetweenToYears(String inputDateMin, String inputDateMax) {
        if (this.listOfBooks.length == 0) return "The library is empty.";
        if (Integer.parseInt(inputDateMin.substring(6)) > Integer.parseInt(inputDateMax.substring(6)))
            return "The beginning of the entered period is after the end of period.";
        int count = 0;
        for (int i = 0; i < this.listOfBooks.length;i++) {
            if (Integer.parseInt(this.listOfBooks[i].getYearOfPublication()) >= Integer.parseInt(inputDateMin.substring(6)) &&
                    Integer.parseInt(this.listOfBooks[i].getYearOfPublication()) <= Integer.parseInt(inputDateMax.substring(6)))
                count++;
            }
        return count + " books has the year of publication between " + inputDateMin + "-" + inputDateMax;
    }

    public String getAuthorOfSpecifBook(String titleToFind) {
        if (this.listOfBooks.length == 0) return "The library is empty.";
        for (int i = 0; i < this.listOfBooks.length;i++) {
            if (this.listOfBooks[i].getTitle().equals(titleToFind)){
               return this.listOfBooks[i].getAuthor();
            }
        }
        return "The book is not in the library.";
    }
}
