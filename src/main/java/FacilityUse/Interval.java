package FacilityUse;
import java.util.Date;

public class Interval {
    Date startDate = new Date();
    Date endDate = new Date();

    public Interval(Date start, Date end){
        this.startDate = start;
        this.endDate = end;
    }

    public boolean isInUseDuringInterval(Date d)
    {
        if(d.after(startDate) && d.before(endDate))
        {
            return false;
        }else{return true;}

    }

}