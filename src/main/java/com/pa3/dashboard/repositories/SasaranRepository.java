package com.pa3.dashboard.repositories;

import com.pa3.dashboard.models.entities.Sasaran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SasaranRepository extends JpaRepository<Sasaran, Integer> {
}
