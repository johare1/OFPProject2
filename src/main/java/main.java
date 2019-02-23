import Maintenence.problem;
import Maintenence.requests;
import java.util.ArrayList;

import Facility.Facility;

public class main {
    public static void main(String[] args){
        ArrayList<Facility> listOfFacilities = new ArrayList<Facility>();
        problem test = new problem("test", 2, 2);
        requests hello = new requests("reee", "info", 2, test);
        System.out.println(hello.getPricetoComplete());
    }

    public void listFacilities(ArrayList<Facility> to_be_printed){
        for(int i = 0; i<to_be_printed.size(); i++){
            System.out.println(to_be_printed.get(i).getName());
        }
    }

    public void addNewFacility(ArrayList<Facility> to_be_added,String uniquename,int capac,String info){
        Facility newfac = new Facility(uniquename,capac,info);
    }

    public void removeFacility(ArrayList<Facility> to_be_deleted,String uniquename){
        for(int i = 0; i<to_be_deleted.size(); i++){
            if(to_be_deleted.get(i).getName().equalsIgnoreCase(uniquename)){
                to_be_deleted.remove(i);
            }
        }
    }
}
