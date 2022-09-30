public class Main {
    public static void main(String[] args) {
       Author author = new Author("Иван", "Тургенев");
       Book book = new Book("Отцы и дети",1988, author);
       Author author1 = new Author("Максим", "Горький");
       Book book1 = new Book("На дне", 1985, author1);
        System.out.println(book.getAuthor().getName()+ " " + book.getAuthor().getSurname() + " \n " + book.getBookName() + " \n " + book.getYearRelease() + " года " + " выпуска" );
        System.out.println( book1.getAuthor().getName() + " " + book1.getAuthor().getSurname() + " \n " + book1.getBookName() + " \n "+ book1.getYearRelease() +" года" + " выпуска"  );
        book.setYearRelease( 1960);
        System.out.println( book.getYearRelease() + " год предыдущий публикации");




    }
}