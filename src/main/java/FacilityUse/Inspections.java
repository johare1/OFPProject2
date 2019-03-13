package FacilityUse;
import java.util.Date;

public class Inspections {

    private String _inspectionInfo;
    private Date completedDate = new Date();
    public int ID;
    
    public Inspections(int ident, Date comp_date, String info){
        setInfo(info);
        this.completedDate = comp_date;
        this.ID = ident;
    }

    public String getInfo(){
        return this._inspectionInfo;
    }
    
    public void setInfo(String value){ 
        this._inspectionInfo = value;
    }

    public String toString()
    {
        return "Inspection number : " + this.ID + " Info: " + this._inspectionInfo + " Date Completed: " + this.completedDate;
    }
}