package com.nevii.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nevii.model.Comintents;
import java.lang.Long;

@Repository("comintentsRepository")
public interface ComintentsRepository extends JpaRepository<Comintents, Long> {

@Query("select c from Comintents c where c.password=?1")
Comintents findByPassword(Long pass);

@Query("select c from Comintents c where c.name=?1")
Comintents findByName(String name);

@Query("select c from Comintents c where c.mb=?1")
Comintents findByMb(int mb);

@Query("select c from Comintents c where c.pib=?1")
Comintents findByPib(int pib);
	
}
