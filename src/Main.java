public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java 8", 1990, "James Bond", 510);

        System.out.println("Книга большая? " + book.isBig());
        System.out.println("Цена книги " + book.estimatePrice() + " рублей.");
        System.out.println("В книге упоминается писатель Bond? " + book.matches("Bond"));
        System.out.println(book);
    }
}