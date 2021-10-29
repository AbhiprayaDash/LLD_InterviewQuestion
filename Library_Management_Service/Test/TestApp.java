package Library_Management_Service.Test;

import Library_Management_Service.Model.Book;
import Library_Management_Service.Model.User;
import Library_Management_Service.Service.*;

public class TestApp {
    public static void main(String[] args) {
        BookIssueService bookIssueService = new BookIssueServiceImpl();
        BookService bookService = new BookServiceImpl();
        RackService rackService = new RackServiceImpl();
        IssueHistoryService issueHistoryService = new IssueHistoryImpl();
        rackService.AddRack(10);
        Book book1 = new Book(1,"think and grow rich","Tim cook","pearson",true);
        Book book2 = new Book(2,"Money master the game","Tim cook","pearson",true);
        bookService.addBook(book1,rackService);
        bookService.addBook(book2,rackService);
        bookService.getBookList();
        System.out.println(rackService.getAvailableRack());
        User user = new User(1,"Abhipraya",0);
        bookIssueService.borrowBook(2,1,rackService);
        bookIssueService.borrowBook(1,2,rackService);
        bookIssueService.returnBook(book2,rackService);
        rackService.printRackList();
        issueHistoryService.issueHistory(1,bookIssueService);
        issueHistoryService.issueHistory(2,bookIssueService);
    }
}

