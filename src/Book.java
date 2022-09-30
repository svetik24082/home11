
public class Book {
    private  final String bookName;
    private int yearRelease;
    private final Author author;

    public Book(String bookName, int yearRelease, Author author) {
        this.bookName = bookName;
        this.yearRelease = yearRelease;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}

