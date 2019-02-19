public class requests{
    String info;
    boolean is_completed;
    problem attached_problem;
    int price_to_complete;
    String Scheduled_date;
    int rate_per_hour;

    public requests(String information,int price_to_comp, problem problem_to_solve){
        this.info = information;
        this.price_to_complete = price_to_comp;
        this.attached_problem = problem_to_solve;
    };
}