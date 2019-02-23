package Maintenence;

public class problem{
    String info;
    int problemRate;
    int downtime;

    public problem(String inform,int problemRater, int downtimer){
        info = inform;
        problemRate = problemRater;
        downtime = downtimer;
    }

    public String toString(){
        return "Info: " + info + ", Problem rate: " + problemRate + ", Downtime: " + downtime;
    }

    public String getInfo(){
        return info;
    }

    public int getProblemRate(){
        return problemRate;
    }

    public int getDowntime(){
        return downtime;
    }
}

