package livraria;

import java.util.List;

public class Order {
    private int id;
    private String nome;
    private String data;
    private Buyer buyer;
    private List<Book> books;

    public Order(int id, String nome, String data, Buyer buyer, List<Book> books) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.buyer = buyer;
        this.books = books;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
