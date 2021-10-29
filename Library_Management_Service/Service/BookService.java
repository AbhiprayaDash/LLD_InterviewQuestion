package Library_Management_Service.Service;

import Library_Management_Service.Model.Book;

public interface BookService {
    public void addBook(Book book,RackService rackService);
    public void removeBook(Book book,RackService rackService);
    public void getBookList();
}
