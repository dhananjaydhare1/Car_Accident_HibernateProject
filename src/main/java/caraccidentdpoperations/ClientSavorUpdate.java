package caraccidentdpoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientSavorUpdate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction();
		Car car = new Car(41,"TATA21","DSD21","8000021");
		session.saveOrUpdate(car);
		transaction.commit();


	}

}
