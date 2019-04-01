package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.entities.BahanAjar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BahanAjarRepository extends JpaRepository<BahanAjar, Integer>{
    List<BahanAjar> findByJudul(String judul);
    BahanAjar findByPenerbit(String penerbit);
}
