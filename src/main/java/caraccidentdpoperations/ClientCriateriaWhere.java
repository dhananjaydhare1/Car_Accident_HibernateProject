package caraccidentdpoperations;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class ClientCriateriaWhere {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);//<<-- means select * from Car
		
		criteria.add(Restrictions.eq("company", "porche"));//where condition
		criteria.add(Restrictions.eq("cost", "3000"));//where condition
		//eq - means equal
		
		List<Car> listCar=criteria.list();
		for(Car car : listCar) {
			System.out.println(car); 
		}
	}

}
