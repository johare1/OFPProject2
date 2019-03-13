import Maintenence.problem;
import Maintenence.requests;
import java.util.*;

import Facility.Facility;

/* TODO: TESTING
public object listFacilities (X)
public object getFacilityInformation(X)
public object requestAvailableCapacity()
public object addNewFacility(X)
public void addFacilityDetail(X)
public object removeFacility(X)
• Facility Use:
public object isInUseDuringInterval(X)
public object assignFacilityToUse(X)
public object vacateFacility(X)
public object listInspections(X)
public object listActualUsage(X)
public object calcUsageRate(X)
• Facility Maintenance:
public object makeFacilityMaintRequest(X)
public object scheduleMaintenance(X) 
public object calcMaintenanceCostForFacility()
public object calcProblemRateForFacility()
public object calcDownTimeForFacility()
public object listMaintRequests()
public object listMaintenance()
public object listFacilityProblems() 
*/

public class main {
    public static void main(String[] args){
        ArrayList<Facility> listOfFacilities = new ArrayList<Facility>();

        // addNewFacility
        addNewFacility(listOfFacilities, "Break Room", 12,"a room to take breaks in",9,"breaks are taken here, usage rate inlcudes: wages for workers not working");
        Facility kitchen = new Facility("Kitchen",14,"where food is made",30,"food is made here, usage rate includes: food made, wages paid, cleaning");

        // getFacilityInformation
        System.out.println("kitchen Info: " + kitchen.getFacilityInformation());

        // requestAvailableCapacity
        System.out.println("kitchen available capacity: "+ kitchen.requestAvailableCapacity());

        // addFacilityDetail
        kitchen.addFacilityDetail(" Detail: kitchen is 3 years out of date");
        System.out.println("kitchen Info updated: " + kitchen.getFacilityInformation());

        // removeFacility
        removeFacility(listOfFacilities, "Break Room");
        System.out.println("no more breaks, break room removed");

        //assignFacilityToUse
        Date start = new Date(2019,5,10);
        Date end = new Date(2019,3,10);
        kitchen.assignFacilityToUse(start, end);

        //isInUseDuringInterval
        Date starttwo = new Date(2019,2,10);
        System.out.println("this should be true: " + kitchen.isInUseDuringInterval(starttwo, end));

        //vacateFacility
        kitchen.vacateFacility();
        System.out.println("this should be true: " + kitchen.vacateStatus());

        //listInspections
        kitchen.ListInspections();

        //listActualUsage
        kitchen.ListActualUsage();

        //calcUsageRate
        System.out.println("this should be 30: " + kitchen.calcUsageRate());

        //makeFacilitMaintRequest
        problem test = new problem("broken grill", 9, 4);
        kitchen.makeFacilityMaintRequest("1", "broken grill in need of repair", 100, test);

        //scheduleMaintenance
        System.out.println("this should be true: " + kitchen.scheduleMaintenence("1",start));

        //public object calcMaintenanceCostForFacility
        System.out.println("this should be 100: " + kitchen.calcMaintenanceCostForFacility());

        //calcProblemRateForFacility
        System.out.println("this should be 9: " + kitchen.calcProblemRateForFacility());

        //calcDownTimeForFacility
        System.out.println("this should be 4: " + kitchen.calcDownTimeForFacility());

        //listMaintRequests
        kitchen.listMaintRequests();

        //listMaintenance
        //this would print finished requests if I had time to make it switch a finished request to this list
        kitchen.listMaintenance();

        //listFacilityProblems
        kitchen.listFacilityProblems();

        //additional test
        requests hello = new requests("reee", "Info", 2, test);
        System.out.println(hello.getPricetoComplete());
        
        // listFacilities
        listFacilities(listOfFacilities);
    }

    public static void listFacilities(ArrayList<Facility> to_be_printed){
        for(int i = 0; i<to_be_printed.size(); i++){
            System.out.println(to_be_printed.get(i).getName());
        }
    }

    public static void addNewFacility(ArrayList<Facility> to_be_added,String uniquename,int capac,String info,int usageRate,String usageInfo){
        Facility newfac = new Facility(uniquename,capac,info,usageRate,usageInfo);
        to_be_added.add(newfac);
    }

    public static void addFacility(ArrayList<Facility> to_be_added,Facility fac_to_be_added){
        Facility newfac = fac_to_be_added;
        to_be_added.add(newfac);
    }

    public static void removeFacility(ArrayList<Facility> to_be_deleted,String uniquename){
        for(int i = 0; i<to_be_deleted.size(); i++){
            if(to_be_deleted.get(i).getName().equalsIgnoreCase(uniquename)){
                to_be_deleted.remove(i);
            }
        }
    }
}
