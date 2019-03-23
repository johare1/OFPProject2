//package src.main.java.Maintenance;
package pkgs.Maintenence;

//problem implementation

public class Problem implements ProblemInf{
    String info;
    int problemRate;
    int downtime;

    public Problem(){
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


    public void setInfo(String info){
       this.info = info;
    }

    public void setProblemRate(int problemRate){
       this.problemRate = problemRate;
    }

    public void setDowntime(int downtime){
        this.downtime=downtime;
    }
}

