package com.nevii.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nevii.model.Ex;


@Repository("exRepository")
public interface ExRepository extends JpaRepository<Ex, Long> {



}
