package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.entities.RiwayatPendidikan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RiwayatPendidikanRepository extends JpaRepository<RiwayatPendidikan, Integer>{
    List<RiwayatPendidikan> findByJenjang(String jenjang);
}
