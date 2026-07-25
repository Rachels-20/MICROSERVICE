package com.uts.mahasiswa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.uts.mahasiswa.entity.Mahasiswa;
import com.uts.mahasiswa.service.MahasiswaService;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/mahasiswa")

public class MahasiswaController {
    @Autowired
    private MahasiswaService mahasiswaService;

    @GetMapping
    public List<Mahasiswa> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswas();
    }

    @PostMapping
    public Mahasiswa createMahasiswa(@RequestBody Mahasiswa mahasiswa) {

        return mahasiswaService.createMahasiswa(mahasiswa);
    }

}
