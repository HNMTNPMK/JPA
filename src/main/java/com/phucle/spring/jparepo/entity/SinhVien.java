package com.phucle.spring.jparepo.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long masv;
    private String hoten;
    private Date ngaysinh;
    private String diachihientai;
    private String cccd;
    private String gioitinh;
    private String quequan;

    @ManyToOne
    @JoinColumn(name = "makh")
    private KhoaHoc khoahoc;

	public SinhVien() {
		super();
	}

	public SinhVien(Long masv, String hoten, Date ngaysinh, String diachihientai, String cccd, String gioitinh,
			String quequan, KhoaHoc khoahoc) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.ngaysinh = ngaysinh;
		this.diachihientai = diachihientai;
		this.cccd = cccd;
		this.gioitinh = gioitinh;
		this.quequan = quequan;
		this.khoahoc = khoahoc;
	}

	public Long getMasv() {
		return masv;
	}

	public void setMasv(Long masv) {
		this.masv = masv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachihientai() {
		return diachihientai;
	}

	public void setDiachihientai(String diachihientai) {
		this.diachihientai = diachihientai;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getQuequan() {
		return quequan;
	}

	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}

	public KhoaHoc getKhoahoc() {
		return khoahoc;
	}

	public void setKhoahoc(KhoaHoc khoahoc) {
		this.khoahoc = khoahoc;
	}

    // Getters and setters
    
}
