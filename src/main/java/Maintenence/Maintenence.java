import java.util.ArrayList;
public class Maintenence{
    //finished requests
    ArrayList<requests> maintenences;
    //pending requests
    ArrayList<requests> requests_for_fac;

    public Maintenence(){

    }

    public scheduleMaintenence(String date_to_schedule){

    }

    public string makeFacilityMaintRequest(String info,int price_to_complete, problem problem_to_solve){
        // first make request
        requests new_request = new requests(String info,int price_to_complete, problem problem_to_solve);
        // add it to list of requests
        this.requests_for_fac.add(new_request);
        return info;
    }
}