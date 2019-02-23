import Maintenence.problem;
import Maintenence.requests;
import java.util.ArrayList;

import Facility.Facility;

/* TODO: TESTING
public object listFacilities (X)
public object getFacilityInformation(X)
public object requestAvailableCapacity()
public object addNewFacility(X)
public void addFacilityDetail()
public object removeFacility()
• Facility Use:
public object isInUseDuringInterval()
public object assignFacilityToUse()
public object vacateFacility()
public object listInspections()
public object listActualUsage()
public object calcUsageRate()
• Facility Maintenance:
public object makeFacilityMaintRequest()
public object scheduleMaintenance() 
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
        System.out.println("kitchen info: " + kitchen.getFacilityInformation());

        // requestAvailableCapacity
        System.out.println("kitchen available capacity: "+ kitchen.requestAvailableCapacity());


        problem test = new problem("test", 2, 2);
        requests hello = new requests("reee", "info", 2, test);
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
