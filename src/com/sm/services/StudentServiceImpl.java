/**
 * 
 */
package com.sm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sm.dao.StudentDAO;
import com.sm.entities.Student;

/**
 * @author skmuddamsetty
 *
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	/* (non-Javadoc)
	 * @see com.sm.services.StudentService#getStudents()
	 */
	@Override
	@Transactional
	public List<Student> getStudents() {
		return studentDAO.getStudents();
	}

}
