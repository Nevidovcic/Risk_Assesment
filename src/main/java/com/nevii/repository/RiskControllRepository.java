package com.nevii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nevii.model.RiskControll;

@Repository("riskControllRepository")
public interface RiskControllRepository extends JpaRepository<RiskControll, Long>{

}
