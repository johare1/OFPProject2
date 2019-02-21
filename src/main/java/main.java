import Maintenence.problem;
import Maintenence.requests;

public class main {
    public static void main(String[] args){
        problem test = new problem("test", 2, 2);
        requests hello = new requests("reee", "info", 2, test);
        System.out.println(hello.getPricetoComplete());
    }
}
