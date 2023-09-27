package com.phucle.spring.jparepo.repository;

import org.springframework.data.repository.CrudRepository;  
import org.springframework.stereotype.Repository;

import com.phucle.spring.jparepo.entity.SinhVien;  

@Repository  
public interface SinhVienRepository extends CrudRepository<SinhVien, Long> {}

