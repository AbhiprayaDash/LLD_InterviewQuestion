package Library_Management_Service.Service;

import java.util.HashMap;
import java.util.List;

public class IssueHistoryImpl implements IssueHistoryService{
    @Override
    public void issueHistory(int userid,BookIssueService bookIssueService) {
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        map=bookIssueService.getUserHistory();
        for(int i=0;i<map.get(userid).size();i++)
        {
            System.out.println("user is"+userid);
            System.out.println(map.get(userid).get(i));
        }
    }
}
