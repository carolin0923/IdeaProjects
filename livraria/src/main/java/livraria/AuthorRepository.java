package livraria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {
    private static String INSERT_AUTHOR = "insert into author (first_name, last_name) values (%s,%s)";
    private static String INSERT_AUTHOR_BOOK = "insert into author_book (author_id, book_id) values (%s,%s)";
    private static String SELECT_AUTHOR = "select * from author where id = %s";
    private static String SELECT_AUTHOR_BOOK = "select * from author_book where author_id= %s";

    public static void insert(Author author) {
        var insertSQL = INSERT_AUTHOR.formatted(author.getFirstName(), author.getLastName());

        System.out.println(insertSQL);

        for (Book book : author.getBooks()) {
            var insertSQLBooks = INSERT_AUTHOR_BOOK.formatted(author.getId(), book.getId());
            System.out.println(insertSQLBooks);
        }
    }
}
