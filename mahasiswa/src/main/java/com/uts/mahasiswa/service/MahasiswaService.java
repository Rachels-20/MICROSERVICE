package com.uts.mahasiswa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uts.mahasiswa.entity.Mahasiswa;
import com.uts.mahasiswa.repository.MahasiswaRepository;

@Service
public class MahasiswaService {
    @Autowired
    MahasiswaRepository mahasiswaRepository;

    public List<Mahasiswa> getAllMahasiswas() {
        return mahasiswaRepository.findAll();
    }

    public Mahasiswa createMahasiswa(Mahasiswa mahasiswa) {
        return mahasiswaRepository.save(mahasiswa);
    }
}
