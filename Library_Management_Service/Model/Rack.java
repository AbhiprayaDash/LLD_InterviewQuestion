package Library_Management_Service.Model;

public class Rack {
    private int serialno;
    private Book book;
    private boolean isAvailable;
    public Rack(int serialno,boolean isAvailable)
    {
        this.serialno=serialno;
        this.isAvailable=isAvailable;
        this.book=null;
    }
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Rack{" +
                "serialno=" + serialno +
                ", book=" + book +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
