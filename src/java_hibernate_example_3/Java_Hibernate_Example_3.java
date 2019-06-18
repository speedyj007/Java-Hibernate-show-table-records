
package java_hibernate_example_3;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Java_Hibernate_Example_3 {


    public static void main(String[] args) {
        
        try{
        
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session  = sf.openSession();
        String hbm = "from demo";
        Criteria ct = session.createCriteria(Members.class);
        List mem = ct.list();
        
        Iterator it = mem.iterator();
        while(it.hasNext())
        {
            Members member = (Members) it.next();
                  System.out.println("");
            System.out.println("Id : "+member.getId());
            System.out.println("First Name : "+member.getFirstname());
            System.out.println("Last Name : "+member.getLastname());
            System.out.println("Email : "+member.getEmail());
            System.out.println("Mobile : "+member.getMobile());
            System.out.println("Password : "+member.getPassword());
            System.out.println("");
        }
        
            session.close();
            sf.close();
        
        }
        catch(Exception e)
        {
            System.out.println("An Error :"+e);
        }
    }
    
}
