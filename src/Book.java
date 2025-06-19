public class Book {
    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book() {
        this.title = "Тестовая книга";
        this.releaseYear = 2025;
        this.author = "Безымянный";
        this.pages = 300;
    }
    public boolean isBig() {
        if (this.pages > 500) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean matches(String word) {
        if (this.title.contains(word) || this.author.contains(word)) {
            return true;
        }
        else {
            return false;
        }
    }
    public int estimatePrice() {
        int price = 0;
        price = this.pages / 3;
        if (price > 250) {
            return price;
        }
        else {
            return 250;
        }
    }

    public String toString() {
        return "title='" + title + "', releaseYear=" + releaseYear +"', author=" + author+"', pages=" + pages;
    }
}
