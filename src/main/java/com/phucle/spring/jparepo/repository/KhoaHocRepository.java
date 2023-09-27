package com.phucle.spring.jparepo.repository;

import org.springframework.data.repository.CrudRepository;  
import org.springframework.stereotype.Repository;

import com.phucle.spring.jparepo.entity.KhoaHoc;  

@Repository  
public interface KhoaHocRepository extends CrudRepository<KhoaHoc, Long> {}

