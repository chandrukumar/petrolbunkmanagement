package com.robustroot.petrolbunkmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robustroot.petrolbunkmanagement.entity.Bunk;

@Repository
public interface BunkRepository extends JpaRepository<Bunk, Long>{
	

}
