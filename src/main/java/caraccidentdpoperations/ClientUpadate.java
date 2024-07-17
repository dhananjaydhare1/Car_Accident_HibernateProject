package caraccidentdpoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientUpadate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction();
		Car car = new Car(4,"TATA1","DSD1","800001");
		session.update(car);
		transaction.commit();

	}

}
