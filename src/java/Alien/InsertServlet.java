package Alien;

import java.io.IOException;
import java.io.PrintWriter;
import javax.imageio.spi.ServiceRegistry;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Manikanta Reddy
 */
public class InsertServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int id = 102;
        String name = "rahul";
        int age = 20;

        Alien p1 = new Alien();
        p1.setId(id);
        p1.setName(name);
        p1.setAge(age);

//        out.println("Inserting Dataaa....");
//        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//        out.println("Configurtion..");
//        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//
//        SessionFactory sf = con.buildSessionFactory(serviceRegistry);
//        out.println("sf");
//        Session session = sf.openSession();
//        out.println("session..");
//        Transaction tx = session.beginTransaction();
//        out.println("transaction..");
//        session.save(p1);
//        out.println("saved..");
//        tx.commit();
//        out.println("commited..");
//        out.println("completed and inserted..");
        SessionFactory sf;
        try {
            Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
            sf = con.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException("Error initializing Hibernate", e);
        }

        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(p1);

        tx.commit();
    }

}
