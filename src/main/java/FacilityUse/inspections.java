public class Inspections {

    private string _inspectionInfo;
    public int ID;
    public string InspectionInfo{get{return _inspectionInfo;}set{ _inspectionInfo = value;}}

    public Date completedDate = new Date();

    public string toString()
    {
        return "Inspection number : " +ID + " info: " _inspectionInfo + " Date Completed: " completedDate;
    }
}