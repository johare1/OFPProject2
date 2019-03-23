package pkgs.FacilityUse;

import java.util.*;
public class FacilityUse {

    private String _info;
    List<Interval> intervalList;
    List<Inspections> inspectionList;
    int usageRate;

    public FacilityUse(){ }

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
        Interval inUseDuring = new Interval();
        inUseDuring.setStartDate(start);
        inUseDuring.setEndDate(end);
        this.intervalList.add(inUseDuring);
    }

    public String get_info(){ return this._info; }
    
    public void set_info(String value){this._info = value; }

    public List<Interval> getIntervalList(){ return this.intervalList; }

    public void setIntervalList(List<Interval> list){this.intervalList = list; }

    public List<Inspections> getInspectionList(){ return this.inspectionList; }

    public void setInspectionList(List<Inspections> list){this.inspectionList = list; }

    public int getUsageRate(){ return this.usageRate; }

    public void setUsageRate(int value){this.usageRate = value; }

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