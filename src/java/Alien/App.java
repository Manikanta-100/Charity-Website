package Alien;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String args[]){
        Alien p1 = new Alien();
        p1.setId(106);
        p1.setName("Manikanta");
        p1.setAge(20);
        
        System.out.println("Inserting Dataaa....");
        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        System.out.println("Configurtion..");
        SessionFactory sf = con.buildSessionFactory();
        System.out.println("sf");
        Session session = sf.openSession();
        System.out.println("session..");
        Transaction tx = session.beginTransaction();
        System.out.println("transaction..");
        session.save(p1);
        System.out.println("saved..");
        tx.commit();
        System.out.println("commited..");
        System.out.println("completed and inserted..");
    }
    
}
