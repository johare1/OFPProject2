import java.util.*;
public class FacilityUse {

    private string _info;
    public string info{get{return _info;}set{_info  = value;}}
    ArrayList<interval> intervalList = new ArrayList<interval>();
    ArrayList<string> inspectionList = new ArrayList<String>();

    //list actual usage
        //return info


    public ListInspections()
    {
        for (string s:inspectionList) {

            System.out.println(s.toString());

        }


    }

    public string ListActualUsage()
    {
        return info;
    }

    public int calcUsageRate()
    {
        int usageRate;

        usageRate = intervalList.size();

        return usageRate;

    }


}