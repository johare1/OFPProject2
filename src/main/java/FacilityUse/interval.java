package FacilityUse;
import java.util.Date;

public class interval {
    Date startDate = new Date();
    Date endDate = new Date();

    public boolean isInUseDuringInterval(Date d)
    {
        if(d.after(startDate) && d.before(endDate))
        {
            return false;
        }else{return true;}

    }

}