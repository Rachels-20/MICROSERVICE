package com.rachel.pelanggan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rachel.pelanggan.model.Pelanggan;

public interface PelangganRepository extends JpaRepository<Pelanggan, Long> {
}
