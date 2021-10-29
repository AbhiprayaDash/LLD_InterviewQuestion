package Library_Management_Service.Service;
import Library_Management_Service.Model.Rack;

import java.util.List;

public interface RackService {
    public Rack getAvailableRack();
    public void AddRack(int numberofRack);
    public List<Rack> getRackList();
    public void printRackList();
}
