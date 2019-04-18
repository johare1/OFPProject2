package pkgs.Maintenence;

import java.util.Date;

public interface RequestsInf {

    public String toString();

    public int getPricetoComplete();

    public void setPricetoComplete(int ptc);

    public String getInfo();

    public void setInfo(String inform);

    public Date getScheduledDate();

    public void setScheduledDate(Date dateSchedule);

    public boolean getIs_completed();

    public void setIs_completed(boolean stat);

    public String getId();

    public void setId(String I);

    public int getRate_per_hour();

    public void setRate_per_hour(int rate);

    public Problem getAttached_Problem();

    public void setAttached_problem(Problem attached_problem);

}
