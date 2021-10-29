package Library_Management_Service.Service;

import Library_Management_Service.Model.Book;
import Library_Management_Service.Model.Rack;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements BookService{
    private List<Book> bookListl = new ArrayList<>();

    @Override
    public void addBook(Book book,RackService rackService) {
        bookListl.add(book);
        Rack rack=rackService.getAvailableRack();
        rack.setBook(book);
        rack.setAvailable(false);
    }

    @Override
    public void removeBook(Book book,RackService rackService) {
        bookListl.remove(book);
        for(int i=0;i<rackService.getRackList().size();i++)
        {
            if(rackService.getRackList().get(i).getBook()==book&&rackService.getRackList().get((i)).isAvailable()==false)
            {
                rackService.getRackList().get(i).setBook(null);
                rackService.getRackList().get(i).setAvailable(true);
            }
        }
    }

    @Override
    public void getBookList() {
        for(int i=0;i<bookListl.size();i++)
        {
            System.out.println(bookListl.get(i));
        }
    }
}
