package com.admission.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.admission.model.StudBookingLog;

/**
* @author ${Vijay Gupta}
*
* Aug 25, 2017
*/
@Repository
public interface BookingSeatRepository extends JpaRepository<StudBookingLog, Integer>{

	
}
