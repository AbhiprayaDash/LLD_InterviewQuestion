package Library_Management_Service.Service;

import Library_Management_Service.Model.Book;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public interface BookIssueService {
    public void borrowBook(int id, int userid,RackService rackService);
    public void returnBook(Book book,RackService rackService);
    public HashMap<Integer, List<Integer>> getUserHistory();
}
