package pkgs.FacilityUse;

import java.util.Date;

public interface IntervalInf {

    public boolean isInUseDuringInterval(Date d);

    public void setStartDate(Date d);

    public Date getStartDate();

    public void setEndDate(Date d);

    public Date getEndDate();
}
