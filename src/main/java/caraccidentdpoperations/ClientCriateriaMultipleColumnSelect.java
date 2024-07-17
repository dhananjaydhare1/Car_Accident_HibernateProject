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

public class ClientCriateriaMultipleColumnSelect {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Car.class);//<<-- means select * from Car
		
		/// select carname from car
		Projection projection1 = Projections.property("company");
		Projection projection2 = Projections.property("cost");
		ProjectionList projection=Projections.projectionList();
		
		projection.add(projection1);
		projection.add(projection2);
;		criteria.setProjection(projection);
		
		
		List<String> listCar=criteria.list();
		
		for(String car : listCar) {
			System.out.println(car); 
		}
	}

}