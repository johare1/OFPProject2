package pkgs.FacilityUse;

import java.util.Date;

public interface InspectionsInf {

    public String get_inspectionInfo();

    public void set_inspectionInfo(String value);

    public Date getCompletedDate();

    public void setCompletedDate(Date d);

    public int getID();

    public void setID(int iden);

    public String toString();
}
