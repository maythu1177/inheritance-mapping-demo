package com.sp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sp.tech.model.InHouseVet;

@Repository
public interface InHouseRepo extends JpaRepository<InHouseVet, Integer> {

}
