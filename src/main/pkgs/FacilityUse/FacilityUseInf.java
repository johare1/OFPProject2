package pkgs.FacilityUse;

import java.util.Date;
import java.util.List;

public interface FacilityUseInf {

    public boolean isInUseDuring(Interval v);

    public void addInterval(Interval v);

    public String get_info();

    public void set_info(String value);

    public List<Interval> getIntervalList();

    public void setIntervalList(List<Interval> list);

    public List<Inspections> getInspectionList();

    public void setInspectionList(List<Inspections> list);

    public int getUsageRate();

    public void setUsageRate(int value);

    public void ListInspections();

    public String ListActualUsage();

    public int calcUsageRate();

}
