package pkgs.FacilityUse;
import java.util.Date;

public class Interval implements IntervalInf {
    Date startDate = new Date();
    Date endDate = new Date();

    public Interval(){}

    public boolean isInUseDuringInterval(Date d)
    {
        if(d.after(startDate) && d.before(endDate))
        {
            return false;
        }else{return true;}

    }

    public void setStartDate(Date d){this.startDate = d;}

    public Date getStartDate(){return this.startDate;}

    public void setEndDate(Date d){this.endDate = d;}

    public Date getEndDate(){return this.endDate;}
}