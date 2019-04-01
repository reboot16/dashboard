package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.entities.Penelitian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PenelitianRepository extends JpaRepository<Penelitian, Integer>{
    List<Penelitian> findByJudul(String judul);
    Penelitian findByTahunPelaksanaan(String tahunPelaksanaan);
}
