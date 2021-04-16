package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.ExHouseVet;

@Repository
public interface ExHouseRepo extends JpaRepository<ExHouseVet, Integer> {

}
