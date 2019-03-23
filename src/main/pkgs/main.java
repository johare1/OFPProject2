package pkgs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pkgs.Maintenence.Problem;
import pkgs.Maintenence.Requests;
import java.util.*;

import pkgs.Facility.Facility;

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

        ApplicationContext context = new ClassPathXmlApplicationContext("file:META_INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        ArrayList<Facility> listOfFacilities = new ArrayList<Facility>();

        // addNewFacility
        Facility kitchen = (Facility) context.getBean("facility");
        kitchen.setName("Kitchen");
        kitchen.setCapacity(14);
        kitchen.setInformation("where food is made");
        kitchen.getUsage_of_facility().setUsageRate(30);
        kitchen.getUsage_of_facility().set_info("food is made here, usage rate includes: food made, wages paid, cleaning");
        addNewFacility(listOfFacilities,kitchen);

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
        Problem test = (Problem) context.getBean("TestProblem");
        test.setInfo("broken grill");
        test.setProblemRate(9);
        test.setDowntime(4);
        kitchen.makeFacilityMaintRequest("1", "broken grill in need of repair", 100,test);
        System.out.println(kitchen.getMaintenence_for_facility().getRequests_for_fac().get(0).getAttached_Problem().toString());

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
        /*Requests hello = new Requests("reee", "Info", 2);
        System.out.println(hello.getPricetoComplete());
        System.out.println(hello.getAttachedProblem().toString());*/
        
        // listFacilities
        listFacilities(listOfFacilities);
    }

    public static void listFacilities(ArrayList<Facility> to_be_printed){
        for(int i = 0; i<to_be_printed.size(); i++){
            System.out.println(to_be_printed.get(i).getName());
        }
    }

    public static void addNewFacility(ArrayList<Facility> to_be_added,Facility fac){
        to_be_added.add(fac);
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
