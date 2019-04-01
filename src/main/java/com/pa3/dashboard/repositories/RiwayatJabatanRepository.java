package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.entities.RiwayatJabatan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RiwayatJabatanRepository extends JpaRepository<RiwayatJabatan, Integer>{
    List<RiwayatJabatan> findByJabatanFungsional(String jabatanFungsional);
}
