package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.entities.Pengajaran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PengajaranRepository extends JpaRepository<Pengajaran, Integer>{
    List<Pengajaran> findByMataKuliah(String mataKuliah);
    Pengajaran findByTahunKurikulum(int tahunKurikulum);
}
