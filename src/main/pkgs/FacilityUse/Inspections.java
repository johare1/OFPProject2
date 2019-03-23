package pkgs.FacilityUse;
import java.util.Date;

public class Inspections {

    private String _inspectionInfo;
    private Date completedDate = new Date();
    public int ID;
    
    public Inspections(){ }

    public String get_inspectionInfo(){
        return this._inspectionInfo;
    }
    
    public void set_inspectionInfo(String value){
        this._inspectionInfo = value;
    }

    public Date getCompletedDate(){return this.completedDate;}

    public void setCompletedDate(Date d){this.completedDate = d;}

    public int getID(){return this.ID;}

    public void setID(int iden){this.ID = iden;}

    public String toString()
    {
        return "Inspection number : " + this.ID + " Info: " + this._inspectionInfo + " Date Completed: " + this.completedDate;
    }
}