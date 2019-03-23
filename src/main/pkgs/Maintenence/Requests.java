package pkgs.Maintenence;
import java.util.Date;

public class Requests{
    private String Id;
    private String info;
    private boolean is_completed;
    private Problem attached_problem;
    private int price_to_complete;
    private Date Scheduled_date;
    private int rate_per_hour;

    public Requests(){ }

    public String toString(){
        return "ID: " + this.Id + ", Info: " + this.info + ", Price to complete: " + this.price_to_complete + ", Problem: (" + this.attached_problem.toString() + ")";
    }

    public int getPricetoComplete(){
        return this.price_to_complete;
    }

    public void setPricetoComplete(int ptc){ this.price_to_complete = ptc;}

    public String getInfo(){
        return this.info;
    }

    public void setInfo(String inform){ this.info = inform;}

    public Date getScheduledDate(){
        return this.Scheduled_date;
    }

    public void setScheduledDate(Date dateSchedule){
        Scheduled_date = dateSchedule;
    }

    public boolean getIs_completed(){
        return this.is_completed;
    }

    public void setIs_completed(boolean stat){this.is_completed = stat;}

    public String getId(){
        return this.Id;
    }

    public void setId(String I){this.Id = I;}

    public int getRate_per_hour(){return this.rate_per_hour;}

    public void setRate_per_hour(int rate){this.rate_per_hour = rate;}

    public Problem getAttached_Problem(){
        return this.attached_problem;
    }

    public void setAttached_problem(Problem attached_problem) {
        this.attached_problem = attached_problem;
    }

}