import java.util.Date;

public class Interval {
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