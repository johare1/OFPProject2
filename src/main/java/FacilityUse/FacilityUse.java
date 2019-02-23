package FacilityUse;

import java.util.*;
public class FacilityUse {

    private String _info;
    ArrayList<interval> intervalList = new ArrayList<interval>();
    ArrayList<inspections> inspectionList = new ArrayList<inspections>();
    int usageRate;

    public boolean isInUseDuring(Date start, Date end){
        for (interval s:this.intervalList) {
            if (s.isInUseDuringInterval(start)){
                return true;
            }
            if (s.isInUseDuringInterval(end)){
                return true;
            }
        }
        return false;
    }

    public FacilityUse(int usage, String inform){
        setInfo(inform);
        this.usageRate = usage;
    }

    public String getInfo(){
        return this._info;
    }
    
    public void setInfo(String value){
        this._info = value;
    }

    public void ListInspections()
    {
        for (inspections s:this.inspectionList) {
            System.out.println(s.toString());
        }
    }

    public String ListActualUsage()
    {
        return this._info;
    }

    public int calcUsageRate()
    {
        return this.usageRate;
    }


}