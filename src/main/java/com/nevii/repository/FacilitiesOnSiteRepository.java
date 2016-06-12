package com.nevii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nevii.model.FacilitiesOnSite;

@Repository("facilitiesOnSiteRepository")
public interface FacilitiesOnSiteRepository extends JpaRepository<FacilitiesOnSite, Long>{

}
