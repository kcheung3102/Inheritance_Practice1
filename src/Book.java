public class Book extends Product {

    public final String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public final int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    private String author;
    private int pages;

    @Override
    final String toString() {
        return "Author:       " + author + "\n" +
                "Pages        " + pages;
    }
}
