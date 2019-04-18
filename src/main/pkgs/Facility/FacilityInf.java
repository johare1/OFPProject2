package pkgs.Facility;

import pkgs.FacilityUse.FacilityUse;
import pkgs.FacilityUse.Interval;
import pkgs.Maintenence.MaintenenceMaster;
import pkgs.Maintenence.Problem;
import pkgs.Maintenence.Requests;

import java.util.Date;
import java.util.List;

public interface FacilityInf {

    public void setMaintenence_for_facility(MaintenenceMaster main);

    public MaintenenceMaster getMaintenence_for_facility();

    public void setUsage_of_facility(FacilityUse use);

    public FacilityUse getUsage_of_facility();

    public void setInformation(String info);

    public String getInformation();

    public void setCapacity(int cap);

    public int getCapacity();

    public void setName(String nam);

    public String getName();

    public boolean vacateStatus();

    public void ListInspections();

    public String ListActualUsage();

    public int calcUsageRate();

    public boolean assignFacilityToUse(Interval v);

    public boolean isInUseDuringInterval(Interval v);

    public void vacateFacility();

    public String getFacilityInformation();

    public int requestAvailableCapacity();

    public void addFacilityDetail(String info_to_be_added);

    public int calcMaintenanceCostForFacility();

    public int calcProblemRateForFacility();

    public void listFacilityProblems();

    public void listMaintRequests();

    public void listMaintenance();

    public String makeFacilityMaintRequest(String ID,String info,int price_to_complete, Problem prob);

    public boolean scheduleMaintenence(String ID,Date date_schedule);

    public int calcDownTimeForFacility();
}
