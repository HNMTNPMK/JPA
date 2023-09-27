package com.phucle.spring.jparepo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phucle.spring.jparepo.entity.SinhVien;
import com.phucle.spring.jparepo.repository.SinhVienRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SinhVienServiceImpl implements SinhVienService {
    @Autowired
    private SinhVienRepository sinhVienRepository;

    @Override
    public List<SinhVien> getAllSinhVien() {
        return (List<SinhVien>) sinhVienRepository.findAll();
    }

    @Override
    public void saveSinhVien(SinhVien sinhVien) {
        sinhVienRepository.save(sinhVien);
    }

    @Override
    public void deleteSinhVien(Long id) {
        sinhVienRepository.deleteById(id);
    }

    @Override
    public Optional<SinhVien> findSinhVienById(Long id) {
        return sinhVienRepository.findById(id);
    }
}
