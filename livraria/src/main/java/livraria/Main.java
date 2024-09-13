package livraria;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book orgulhoEPreconceito = new Book(2, "Orgulho e Preconceito",424);

        Book razaoESensibilidade= new Book(3, "Razão e Sensibilidade",354);

        Author author = new Author(1, "Jane", "Austen", "Reino Unido", List.of(orgulhoEPreconceito, razaoESensibilidade));

    }
    System.out.println("Autor: " + author.getFirstName() + " " + author.getLastName() + ", " + author.getCountry());
        System.out.println("Livros:");
        for (Book book ; : author.getBooks()) {
        System.out.println("- " + book.getTitle() + " (" + book.getPage() + " páginas)");
    }

}