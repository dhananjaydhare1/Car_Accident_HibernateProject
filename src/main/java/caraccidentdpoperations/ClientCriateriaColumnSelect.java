package caraccidentdpoperations;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;

import java.util.List;

public class ClientCriateriaColumnSelect {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);// <<-- means select * from Car

		/// select carname from car
		Projection projection1 = Projections.property("company");
		Projection projection2 = Projections.property("company");
		ProjectionList projection = Projections.projectionList();
		criteria.setProjection(projection);

		List<Object[]> listCar = criteria.list();
		// due to multiple column - itll return list of object array.
		for (Object[] car : listCar) {
			for (Object object : car) {
				System.out.println(car);
			}
		}
	}

}
