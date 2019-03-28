package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.entities.Visi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisiRepository extends JpaRepository<Visi, Integer> {
}
