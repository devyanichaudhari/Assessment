package com.onetomany.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onetomany.model.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Long> {
List<Mobile> findByMobileName(String mName);
}