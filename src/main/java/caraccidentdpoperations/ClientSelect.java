package caraccidentdpoperations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Car car = session.load(Car.class, 2);

		System.out.println(car);
		Car car1 = session.load(Car.class, 4);

		System.out.println(car1);
	}

}
