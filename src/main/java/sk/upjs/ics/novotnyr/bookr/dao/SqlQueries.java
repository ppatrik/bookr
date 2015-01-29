package sk.upjs.ics.novotnyr.bookr.dao;


public class SqlQueries {
    public static final String SELECT_ALL_BOOKS = "SELECT \n" +
            "   book.id as book_id,\n" +
            "	book.title as book_title,\n" +
            "	book.path as book_path,\n" +
            "	book.year as book_year,\n" +
            "	publisher.id as publisher_id,\n" +
            "	publisher.name as publisher_name,\n" +
            "	publisher.web as publisher_web\n" +
            "\n" +
            "FROM book\n" +
            "JOIN publisher on publisher.id = book.publisher_id";

    public static final String SELECT_BOOK_BY_ID = "SELECT \n" +
            "   book.id as book_id,\n" +
            "	book.title as book_title,\n" +
            "	book.path as book_path,\n" +
            "	book.year as book_year,\n" +
            "	publisher.id as publisher_id,\n" +
            "	publisher.name as publisher_name,\n" +
            "	publisher.web as publisher_web\n" +
            "\n" +
            "FROM book\n" +
            "JOIN publisher on publisher.id = book.publisher_id\n" +
            "WHERE book.id = ?";

    public static final String SELECT_BOOK_BY_TITLE_SUBSTRING = "SELECT \n" +
            "   book.id as book_id,\n" +
            "	book.title as book_title,\n" +
            "	book.path as book_path,\n" +
            "	book.year as book_year,\n" +
            "	publisher.id as publisher_id,\n" +
            "	publisher.name as publisher_name,\n" +
            "	publisher.web as publisher_web\n" +
            "\n" +
            "FROM book\n" +
            "JOIN publisher on publisher.id = book.publisher_id\n" +
            "WHERE book.title LIKE '%' || ? || '%'";

    public static final String SELECT_BOOK_BY_PUBLISHER = "SELECT \n" +
            "   book.id as book_id,\n" +
            "	book.title as book_title,\n" +
            "	book.path as book_path,\n" +
            "	book.year as book_year,\n" +
            "	publisher.id as publisher_id,\n" +
            "	publisher.name as publisher_name,\n" +
            "	publisher.web as publisher_web\n" +
            "\n" +
            "FROM book\n" +
            "JOIN publisher on publisher.id = book.publisher_id\n" +
            "WHERE publisher.id = ?";
}
