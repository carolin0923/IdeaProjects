package livraria;

public class Book {
    private int id;
    private String title;
    private int page;

    public Book (int id, String title, int page) {
        this.id = id;
        this.title = title;
        this.page = page;
    }

    public int getId() {
        return this.id;
    }

    public  String getTitle() {
        return title;
    }

    public int getPage() {
        return page;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPage(int page) {
        this.page = page;
    }

}
