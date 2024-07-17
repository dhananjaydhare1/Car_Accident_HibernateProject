package caraccidentdpoperations;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClientQuery {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);// <<-- means select * from Car
		Query query = session.createQuery("from Car");
	
		List<Car> listCar = query.list();
		
		for(Car car : listCar) {
			System.out.println(car);
		}
	}

}
