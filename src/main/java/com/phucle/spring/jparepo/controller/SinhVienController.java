package com.phucle.spring.jparepo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import com.phucle.spring.jparepo.entity.*;
import com.phucle.spring.jparepo.service.*;
@Controller
@RequestMapping("/sinhvien")
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/list")
    public String listSinhVien(Model model) {
        List<SinhVien> sinhViens = sinhVienService.getAllSinhVien();
        model.addAttribute("sinhViens", sinhViens);
        return "list-sinhviens";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model model) {
        SinhVien sinhVien = new SinhVien();
        model.addAttribute("sinhVien", sinhVien);
        return "sinhvien-form";
    }
 

    @PostMapping("/saveSinhVien")
    public String saveSinhVien(@ModelAttribute("sinhVien") SinhVien sinhVien) {
        sinhVienService.saveSinhVien(sinhVien);
        return "redirect:/sinhvien/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("masv") Long masv, Model model) {
        Optional<com.phucle.spring.jparepo.entity.SinhVien> sinhVien = sinhVienService.findSinhVienById(masv);
        model.addAttribute("sinhVien", sinhVien);
        return "sinhvien-form";
    }

    @GetMapping("/delete")
    public String deleteSinhVien(@RequestParam("masv") Long masv) {
        sinhVienService.deleteSinhVien(masv);
        return "redirect:/sinhvien/list";
    }
}