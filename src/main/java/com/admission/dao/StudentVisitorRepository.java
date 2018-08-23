package com.admission.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admission.model.StaffInfo;
import com.admission.model.StudentVisitor;

public interface StudentVisitorRepository extends JpaRepository<StudentVisitor, String>{

	/*public List<StudentVisitor> findByName(String name);*/
}
