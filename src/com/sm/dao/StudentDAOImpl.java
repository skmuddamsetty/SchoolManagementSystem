/**
 * 
 */
package com.sm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sm.entities.Student;

/**
 * @author skmuddamsetty
 *
 */
@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.sm.dao.StudentDAO#getStudents()
	 */
	@Override
	@Transactional
	public List<Student> getStudents() {
		
		//get current hibernate session
		Session session = sessionFactory.getCurrentSession();
		//create a query
		Query<Student> students = session.createQuery("from Student",Student.class);
		//execute the query and get the results
		List<Student> resultList = students.getResultList();
		//return results
		return resultList;
	}

}
