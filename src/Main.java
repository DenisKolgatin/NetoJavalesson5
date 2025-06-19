public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java 8";
        book.author = "James Bond";
        book.pages = 510;
        book.releaseYear = 1990;

        System.out.println(book.isBig());
        System.out.println(book.estimatePrice());
        System.out.println(book.matches("Bond"));

        Book book2 = new Book();
        System.out.println(book2);
    }
}