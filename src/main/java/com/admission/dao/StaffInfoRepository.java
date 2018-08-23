package com.admission.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admission.model.StaffInfo;

public interface StaffInfoRepository extends JpaRepository<StaffInfo, Integer>{

	public List<StaffInfo> findByName(String name);
	public List<StaffInfo> findByUid(String id);
}
