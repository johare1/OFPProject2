package FacilityUse;
import java.util.Date;

public class interval {
    Date startDate = new Date();
    Date endDate = new Date();

    public interval(Date start,Date end){
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