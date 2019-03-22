import Maintenence.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;
import sun.applet.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpringTest {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("META_INF/app-context.xml");
        System.out.println("***************** Application Context instantiated! ******************");

        MaintenenceMaster testmas = (MaintenenceMaster) context.getBean("maintenencemaster");
        Requests testreq = (Requests) context.getBean("request");
        testreq.setPricetoComplete(10);
        testreq.setInfo("broken grilla needs to be fized");
        testreq.setIs_completed(false);
        testreq.setRate_per_hour(2);
        testreq.setId("BG");

        testreq.getAttachedProblem().setDowntime(5);
        testreq.getAttachedProblem().setInfo("broken grilla");
        testreq.getAttachedProblem().setProblemRate(8);

        List<Requests> testlist = new ArrayList<Requests>( Arrays.asList(testreq));

        testmas.setMaintenences(testlist);
        testmas.setRequests_for_fac(testlist);

        System.out.println(testmas.getRequests_for_fac().get(0).toString());

        System.out.println(testmas.getRequests_for_fac().get(0).getAttachedProblem().toString());

    }
}
