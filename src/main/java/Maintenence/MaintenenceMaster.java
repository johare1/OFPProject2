package Maintenence;
import java.util.ArrayList;
import java.util.Date;

public class MaintenenceMaster{
    //finished requests
    ArrayList<Requests> maintenences = new ArrayList<Requests>();
    //pending requests
    ArrayList<Requests> requests_for_fac = new ArrayList<Requests>();

    public MaintenenceMaster(){

    }

    // Loops through requests, taking their problems to make a list and returning it
    public ArrayList<Problem> getProblems(){
        ArrayList<Problem> problems_to_be_returned = new ArrayList<Problem>();
        for(int i = 0; i < requests_for_fac.size(); i++){
            problems_to_be_returned.add(requests_for_fac.get(i).getAttachedProblem());
        }
        return problems_to_be_returned;
    }

    public ArrayList<Requests> listMaintRequests(){
        return requests_for_fac;
    }

    public ArrayList<Requests> listMaintenance(){
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

    public String makeFacilityMaintRequest(String ID,String info,int price_to_complete, Problem problem_to_solve){
        // first make request
        Requests new_request = new Requests(ID,info,price_to_complete,problem_to_solve);
        // add it to list of requests
        this.requests_for_fac.add(new_request);
        return info;
    }
}