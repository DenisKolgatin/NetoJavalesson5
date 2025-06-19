public class Book {
    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public boolean isBig() {
        return this.pages > 500;
    }

    public boolean matches(String word) {
        return this.title.contains(word) || this.author.contains(word);
    }

    public int estimatePrice() {
        int price = 0;
        price = this.pages / 3;
        if (price > 250) {
            return price;
        } else {
            return 250;
        }
    }

    public String toString() {
        return "title='" + title + "', releaseYear=" + releaseYear + "', author=" + author + "', pages=" + pages;
    }
}
