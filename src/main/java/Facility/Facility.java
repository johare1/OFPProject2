package Facility;
import Maintenence.*;
import java.util.*;

public class Facility {
    private int capacity;
    private boolean isvacated;
    //private info information;
    private MaintenenceMaster Maintenence_for_facility;

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