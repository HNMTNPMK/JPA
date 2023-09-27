package com.phucle.spring.jparepo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class KhoaHoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long makh;
    private String tenkhoahoc;
    private String nienkhoa;

    @OneToMany(mappedBy = "khoahoc")
    private List<SinhVien> sinhViens;

	public KhoaHoc() {
		super();
	}

	public KhoaHoc(Long makh, String tenkhoahoc, String nienkhoa, List<SinhVien> sinhViens) {
		super();
		this.makh = makh;
		this.tenkhoahoc = tenkhoahoc;
		this.nienkhoa = nienkhoa;
		this.sinhViens = sinhViens;
	}

	public Long getMakh() {
		return makh;
	}

	public void setMakh(Long makh) {
		this.makh = makh;
	}

	public String getTenkhoahoc() {
		return tenkhoahoc;
	}

	public void setTenkhoahoc(String tenkhoahoc) {
		this.tenkhoahoc = tenkhoahoc;
	}

	public String getNienkhoa() {
		return nienkhoa;
	}

	public void setNienkhoa(String nienkhoa) {
		this.nienkhoa = nienkhoa;
	}

	public List<SinhVien> getSinhViens() {
		return sinhViens;
	}

	public void setSinhViens(List<SinhVien> sinhViens) {
		this.sinhViens = sinhViens;
	}

    // Getters and setters
    
}

