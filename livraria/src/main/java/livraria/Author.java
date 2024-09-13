package livraria;

import java.util.List;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    private String countryOfOrigin;
    private List<Book> books;

    public Author(int id, String firstName, String lastName, String countryOfOrigin, List<Book> books){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryOfOrigin = countryOfOrigin;
        this.books = books;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return this.books;
    }
}
