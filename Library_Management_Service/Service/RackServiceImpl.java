package Library_Management_Service.Service;

import Library_Management_Service.Model.Rack;

import java.util.ArrayList;
import java.util.List;

public class RackServiceImpl implements RackService{
    List<Rack> rackList = new ArrayList<>();

    @Override
    public Rack getAvailableRack() {
        for(int i=0;i<rackList.size();i++)
        {
            if(rackList.get(i).isAvailable())
            {
                return rackList.get(i);
            }
        }
        return new Rack(0,false);
    }

    @Override
    public void AddRack(int numberofRack) {
        for(int i=0;i<numberofRack;i++)
        {
            Rack rack = new Rack(i,true);
            rackList.add(rack);
        }
    }

    public List<Rack> getRackList() {
        return rackList;
    }
    public void printRackList() {
        for(int i=0;i<rackList.size();i++)
        {
            System.out.println(rackList.get(i));
        }
    }
}
