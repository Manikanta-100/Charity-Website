import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DonationDAO {
    private final SessionFactory sessionFactory;

    public DonationDAO() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
//         sessionFactory = new Configuration().configure().addAnnotatedClass(Donation.class).buildSessionFactory();
    }

    public void save(Donation donation) {
        Session session = sessionFactory.openSession(); 
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(donation);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback(); 
            }
            e.printStackTrace(); 
        } finally {
            session.close(); 
        }
    }
}
