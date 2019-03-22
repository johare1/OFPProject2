package Maintenence;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class MaintenenceMaster{
    //finished requests
    List<Requests> maintenences;
    //pending requests
    List<Requests> requests_for_fac;

    public MaintenenceMaster(){

    }

    // Loops through requests, taking their problems to make a list and returning it
    public List<Problem> getProblems(){
        List<Problem> problems_to_be_returned = new ArrayList<Problem>();
        for(int i = 0; i < requests_for_fac.size(); i++){
            problems_to_be_returned.add(requests_for_fac.get(i).getAttachedProblem());
        }
        return problems_to_be_returned;
    }

    public List<Requests> listMaintRequests(){
        return requests_for_fac;
    }

    public List<Requests> listMaintenance(){
        return maintenences;
    }

    public boolean scheduleMaintenence(String ID,Date date_schedule){
        for(int i = 0; i < requests_for_fac.size();i++){
            if (requests_for_fac.get(i).getId() == ID){
                requests_for_fac.get(i).setScheduledDate(date_schedule);
                return true;
            }
        }
        return false;
    }

    public String makeFacilityMaintRequest(String ID,String info,int price_to_complete){
        // first make request
        Requests new_request = new Requests();
        new_request.setId(ID);
        new_request.setInfo(info);
        new_request.setPricetoComplete(price_to_complete);
        // add it to list of requests
        this.requests_for_fac.add(new_request);
        return info;
    }

    public void setMaintenences(List<Requests> maintenence){this.maintenences = maintenence;}

    public List<Requests> getMaintenences(){return this.maintenences;}

    public void setRequests_for_fac(List<Requests> req){this.requests_for_fac = req;}

    public List<Requests> getRequests_for_fac(){return this.requests_for_fac;}
}