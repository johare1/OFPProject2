package Facility;
import Maintenence.*;
import java.util.*;

public class Facility {
    private int capacity;
    private boolean isvacated;
    private String name;
    private String information;
    private MaintenenceMaster Maintenence_for_facility;

    public Facility(String uniquename,int capac,String info){
        this.Maintenence_for_facility = new MaintenenceMaster();
        this.capacity = capac;
        this.name = uniquename;

    }

    public String getName(){
        return this.name;
    }

    public String getFacilityInformation(){
        return this.information;
    }

    public int requestAvailableCapacity(){
        return this.capacity;
    }

    public void addFacilityDetail(String info_to_be_added){
        this.information = this.information + info_to_be_added;
    }

    public int calcMaintenanceCostForFacility(){
        ArrayList<requests> requests_for_this_facility = Maintenence_for_facility.listMaintRequests();
        int cost = 0;
        for (int i = 0; i < requests_for_this_facility.size(); i++){
            cost += requests_for_this_facility.get(i).getPricetoComplete();
        }  
        return cost;      
    }

    public int calcProblemRateForFacility(){
        ArrayList<requests> requests_for_this_facility = Maintenence_for_facility.listMaintRequests();
        int problemRate = 0;
        for (int i = 0; i < requests_for_this_facility.size(); i++){
            problemRate += requests_for_this_facility.get(i).getAttachedProblem().getProblemRate();
        }  
        return problemRate;     
    }

    public ArrayList<problem> listFacilityProblems(){
        return Maintenence_for_facility.getProblems();
    }

    public int calcDownTimeForFacility(){
        ArrayList<requests> requests_for_this_facility = Maintenence_for_facility.listMaintRequests();
        int totalDowntime = 0;
        for (int i = 0; i < requests_for_this_facility.size(); i++){
            totalDowntime += requests_for_this_facility.get(i).getAttachedProblem().getDowntime();
        }  
        return totalDowntime; 
    }
}