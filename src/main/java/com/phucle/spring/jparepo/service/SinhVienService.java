package com.phucle.spring.jparepo.service;




import java.util.List;
import java.util.Optional;

import com.phucle.spring.jparepo.entity.SinhVien;

public interface SinhVienService {
    List<SinhVien> getAllSinhVien();

    void saveSinhVien(SinhVien sinhVien);

    void deleteSinhVien(Long id);


    Optional<SinhVien> findSinhVienById(Long id);
}

