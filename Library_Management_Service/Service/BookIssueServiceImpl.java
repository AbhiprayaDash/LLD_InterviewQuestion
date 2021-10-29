package Library_Management_Service.Service;

import Library_Management_Service.Model.Book;
import Library_Management_Service.Model.Rack;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.HashMap;

public class BookIssueServiceImpl implements BookIssueService{
    HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
    List<Integer> BookidList = new ArrayList<>();
    @Override
    public void borrowBook(int id, int userid,RackService rackService) {
        List<Rack> rackList=rackService.getRackList();
        for(int i=0;i<rackList.size();i++)
        {
            if(rackList.get(i).getBook()== null)
                continue;
            if(rackList.get(i).getBook().getId()==id&&rackList.get(i).isAvailable()==false)
            {
                rackList.get(i).setAvailable(true);
                BookidList.add(id);
                map.put(userid,BookidList);
            }
        }
    }

    @Override
    public void returnBook(Book book,RackService rackService) {
        List<Rack> rackList=rackService.getRackList();
        for(int i=0;i<rackList.size();i++)
        {
            if(rackList.get(i).isAvailable()==true)
            {
                rackList.get(i).setAvailable(false);
                rackList.get(i).setBook(book);
                return;
            }
        }
    }

    public HashMap<Integer, List<Integer>> getUserHistory() {
        return map;
    }
}
