package pkgs.Maintenence;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface MaintenenceMasterInf {

    public List<Problem> getProblems();

    public List<Requests> listMaintRequests();

    public List<Requests> listMaintenance();

    public boolean scheduleMaintenence(String ID, Date date_schedule);

    public String makeFacilityMaintRequest(String ID,String info,int price_to_complete,Problem probe);

    public void setMaintenences(List<Requests> maintenence);

    public List<Requests> getMaintenences();

    public void setRequests_for_fac(List<Requests> req);

    public List<Requests> getRequests_for_fac();
}

