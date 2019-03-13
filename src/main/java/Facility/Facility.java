package Facility;
import Maintenence.*;
import java.util.*;

import FacilityUse.FacilityUse;

public class Facility {
    private int capacity;
    private boolean isvacated = false;
    private String name;
    private String information;
    private MaintenenceMaster Maintenence_for_facility;
    private FacilityUse Usage_of_facility;

    public Facility(String uniquename,int capac,String info,int useRate,String info_about_use){
        this.Maintenence_for_facility = new MaintenenceMaster();
        this.Usage_of_facility = new FacilityUse(useRate, info_about_use);
        this.information = info;
        this.capacity = capac;
        this.name = uniquename;
    }

    public boolean vacateStatus(){
        return isvacated;
    }

    public void ListInspections()
    {
       Usage_of_facility.ListInspections();
    }

    public String ListActualUsage()
    {
        return Usage_of_facility.ListActualUsage();
    }

    public int calcUsageRate()
    {
        return Usage_of_facility.calcUsageRate();
    }
    public boolean assignFacilityToUse(Date start,Date end){
        boolean canSchedule = Usage_of_facility.isInUseDuring(start, end);
        if (!canSchedule){
            this.Usage_of_facility.addInterval(start,end);
            return true;
        }
        return false;
    }

    public boolean isInUseDuringInterval(Date start,Date end){
        return Usage_of_facility.isInUseDuring(start, end);
    }

    public void vacateFacility(){
        this.isvacated = true;
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
        ArrayList<Requests> requests_for_this_facility = Maintenence_for_facility.listMaintRequests();
        int cost = 0;
        for (int i = 0; i < requests_for_this_facility.size(); i++){
            cost += requests_for_this_facility.get(i).getPricetoComplete();
        }  
        return cost;      
    }

    public int calcProblemRateForFacility(){
        ArrayList<Requests> requests_for_this_facility = Maintenence_for_facility.listMaintRequests();
        int problemRate = 0;
        for (int i = 0; i < requests_for_this_facility.size(); i++){
            problemRate += requests_for_this_facility.get(i).getAttachedProblem().getProblemRate();
        }  
        return problemRate;     
    }

    public void listFacilityProblems(){
        for (Problem s:Maintenence_for_facility.getProblems())
        System.out.println(s.toString());
    }

    public void listMaintRequests(){
        for (Requests s:Maintenence_for_facility.listMaintRequests())
        System.out.println(s.toString());
    }

    public void listMaintenance(){
        for (Requests s:Maintenence_for_facility.listMaintenance())
        System.out.println(s.toString());
    }

    public String makeFacilityMaintRequest(String ID,String info,int price_to_complete, Problem problem_to_solve){
        Maintenence_for_facility.makeFacilityMaintRequest(ID, info, price_to_complete, problem_to_solve);
        return info;
    }

    public boolean scheduleMaintenence(String ID,Date date_schedule){
        return Maintenence_for_facility.scheduleMaintenence(ID, date_schedule);
    }

    public int calcDownTimeForFacility(){
        ArrayList<Requests> requests_for_this_facility = Maintenence_for_facility.listMaintRequests();
        int totalDowntime = 0;
        for (int i = 0; i < requests_for_this_facility.size(); i++){
            totalDowntime += requests_for_this_facility.get(i).getAttachedProblem().getDowntime();
        }  
        return totalDowntime; 
    }
}