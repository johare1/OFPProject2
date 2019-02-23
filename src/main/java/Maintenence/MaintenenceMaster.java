package Maintenence;
import java.util.ArrayList;
import java.util.Date;

public class MaintenenceMaster{
    //finished requests
    ArrayList<requests> maintenences = new ArrayList<requests>();
    //pending requests
    ArrayList<requests> requests_for_fac = new ArrayList<requests>();

    public MaintenenceMaster(){

    }

    // Loops through requests, taking their problems to make a list and returning it
    public ArrayList<problem> getProblems(){
        ArrayList<problem> problems_to_be_returned = new ArrayList<problem>();
        for(int i = 0; i < requests_for_fac.size(); i++){
            problems_to_be_returned.add(requests_for_fac.get(i).getAttachedProblem());
        }
        return problems_to_be_returned;
    }

    public ArrayList<requests> listMaintRequests(){
        return requests_for_fac;
    }

    public ArrayList<requests> listMaintenance(){
        return maintenences;
    }

    public boolean scheduleMaintenence(String ID,Date date_schedule){
        for(int i = 0; i < requests_for_fac.size();i++){
            if (requests_for_fac.get(i).getID() == ID){
                requests_for_fac.get(i).setScheduledDate(date_schedule);
                return true;
            }
        }
        return false;
    }

    public String makeFacilityMaintRequest(String ID,String info,int price_to_complete, problem problem_to_solve){
        // first make request
        requests new_request = new requests(ID,info,price_to_complete,problem_to_solve);
        // add it to list of requests
        this.requests_for_fac.add(new_request);
        return info;
    }
}