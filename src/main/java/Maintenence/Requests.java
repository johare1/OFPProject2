package Maintenence;
import java.util.Date;

public class Requests{
    String Id;
    String info;
    boolean is_completed;
    problem attached_problem;
    int price_to_complete;
    Date Scheduled_date;
    int rate_per_hour;

    public String toString(){
        return "ID: " + this.Id + ", Info: " + this.info + ", Price to complete: " + this.price_to_complete + ", Problem: " + this.attached_problem.toString();
    }

    public problem getAttachedProblem(){
        return this.attached_problem;
    };

    public int getPricetoComplete(){
        return this.price_to_complete;
    };

    public String getInfo(){
        return this.info;
    };

    public Date getScheduledDate(){
        return this.Scheduled_date;
    };

    public boolean getStatus(){
        return this.is_completed;
    }

    public void setScheduledDate(Date dateSchedule){
        Scheduled_date = dateSchedule;
    }

    public String getID(){
        return this.Id;
    }

    public Requests(String ID,String information,int price_to_comp, problem problem_to_solve){
        this.Id = ID;
        this.info = information;
        this.price_to_complete = price_to_comp;
        this.attached_problem = problem_to_solve;
    };
}