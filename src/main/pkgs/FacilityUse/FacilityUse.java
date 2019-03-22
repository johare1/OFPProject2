package FacilityUse;

import java.util.*;
public class FacilityUse {

    private String _info;
    ArrayList<Interval> intervalList = new ArrayList<Interval>();
    ArrayList<Inspections> inspectionList = new ArrayList<Inspections>();
    int usageRate;

    public boolean isInUseDuring(Date start, Date end){
        for (Interval s:this.intervalList) {
            if (s.isInUseDuringInterval(start)){
                return true;
            }
            if (s.isInUseDuringInterval(end)){
                return true;
            }
        }
        return false;
    }

    public void addInterval(Date start,Date end){
        Interval inUseDuring = new Interval(start,end);
        this.intervalList.add(inUseDuring);
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
        for (Inspections s:this.inspectionList) {
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