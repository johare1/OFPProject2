import java.util.ArrayList;
public class Maintenence{
    //finished requests
    ArrayList<requests> maintenences;
    //pending requests
    ArrayList<requests> requests_for_fac;

    public Maintenence(){

    }

    public ArrayList<problems> getProblems(){
        ArrayList<problems> problems_to_be_returned = new ArrayList<problems>();
        for(int i = 0; i < requests_for_fac.size(); i++){
            problems_to_be_returned.add(requests_for_fac[i]);
        }
        return problems_to_be_returned;
    }

    public ArrayList<requests> listMaintRequests(){
        return requests_for_fac;
    }

    public ArrayList<requests> listMaintenance(){
        return maintenences;
    }

    public void scheduleMaintenence(String date_to_schedule){

    }

    public string makeFacilityMaintRequest(String info,int price_to_complete, problem problem_to_solve){
        // first make request
        requests new_request = new requests(info,price_to_complete,problem_to_solve);
        // add it to list of requests
        this.requests_for_fac.add(new_request);
        return info;
    }
}