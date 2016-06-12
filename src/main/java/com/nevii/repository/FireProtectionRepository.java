package com.nevii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nevii.model.Protection;

@Repository("fireProtectionRepository")
public interface FireProtectionRepository extends JpaRepository<Protection, Long> {
	
	

}
