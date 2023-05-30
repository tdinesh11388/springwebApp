package org.ass.springweb.Repository;

import java.util.Collections;
import java.util.List;

import org.ass.springweb.entity.RegisterEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public class RegisterRepository 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveUser(RegisterEntity registerEntity)
	{
		Session session = sessionFactory.openSession();
		Transaction transcation = session.beginTransaction();
		session.save(registerEntity);
		transcation.commit();
	}
	
	public List<RegisterEntity>findAllUser()
	{
		try {
			String hqlQuery="from RegisterEntity";
			
			Session session=sessionFactory.openSession();
			Query query = session.createQuery(hqlQuery);
			return query.getResultList();
		}catch(Exception e) {
			
		}
		return Collections.EMPTY_LIST ;
	}
}
