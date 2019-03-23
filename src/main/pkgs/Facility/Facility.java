package pkgs.Facility;
import pkgs.Maintenence.*;
import java.util.*;

import pkgs.FacilityUse.FacilityUse;

public class Facility {
    private int capacity;
    private boolean isvacated = false;
    private String name;
    private String information;
    private MaintenenceMaster Maintenence_for_facility;
    private FacilityUse Usage_of_facility;

    public Facility(){
        //this.Usage_of_facility = new FacilityUse(useRate, info_about_use);
    }

    public void setMaintenence_for_facility(MaintenenceMaster main){this.Maintenence_for_facility = main;}

    public MaintenenceMaster getMaintenence_for_facility(){return Maintenence_for_facility;}

    public void setUsage_of_facility(FacilityUse use){this.Usage_of_facility = use;}

    public FacilityUse getUsage_of_facility(){return this.Usage_of_facility;}

    public void setInformation(String info){this.information = info;}

    public String getInformation(){return this.information;}

    public void setCapacity(int cap){this.capacity = cap;}

    public int getCapacity(){return this.capacity;}

    public void setName(String nam){this.name = nam;}

    public String getName(){
        return this.name;
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
        List<Requests> requests_for_this_facility = Maintenence_for_facility.listMaintRequests();
        int cost = 0;
        for (int i = 0; i < requests_for_this_facility.size(); i++){
            cost += requests_for_this_facility.get(i).getPricetoComplete();
        }  
        return cost;      
    }

    public int calcProblemRateForFacility(){
        List<Requests> requests_for_this_facility = Maintenence_for_facility.listMaintRequests();
        int problemRate = 0;
        for (int i = 0; i < requests_for_this_facility.size(); i++){
            problemRate += requests_for_this_facility.get(i).getAttached_Problem().getProblemRate();
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

    public String makeFacilityMaintRequest(String ID,String info,int price_to_complete, Problem prob){
        Maintenence_for_facility.makeFacilityMaintRequest(ID, info, price_to_complete, prob);
        return info;
    }

    public boolean scheduleMaintenence(String ID,Date date_schedule){
        return Maintenence_for_facility.scheduleMaintenence(ID, date_schedule);
    }

    public int calcDownTimeForFacility(){
        List<Requests> requests_for_this_facility = Maintenence_for_facility.listMaintRequests();
        int totalDowntime = 0;
        for (int i = 0; i < requests_for_this_facility.size(); i++){
            totalDowntime += requests_for_this_facility.get(i).getAttached_Problem().getDowntime();
        }  
        return totalDowntime; 
    }
}