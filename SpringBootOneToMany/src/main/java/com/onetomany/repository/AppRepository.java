package com.onetomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.onetomany.model.Apps;

public interface AppRepository extends JpaRepository<Apps,Long>{
	List<Apps> findMobileById(long id);
}
