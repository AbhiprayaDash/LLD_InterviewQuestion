package Library_Management_Service.Model;


public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private boolean isAvailable;
    public Book(int id,String title,String author,String publisher,boolean isAvailable)
    {
        this.author=author;
        this.id=id;
        this.title=title;
        this.publisher=publisher;
        this.isAvailable=isAvailable;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
