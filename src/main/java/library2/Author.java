package library2;

public class Author {
    public String surname;
    public String nationality;

    public Author() {
        surname = "";
        nationality = "";

    }
    public Author addAuthor (String name, String nation){
    Author newAuthor = new Author();
    newAuthor.surname = name;
    newAuthor.nationality = nation;
    return newAuthor;
     }
}
