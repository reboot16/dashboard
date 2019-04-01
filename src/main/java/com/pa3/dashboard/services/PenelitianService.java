package com.pa3.dashboard.services;

import com.pa3.dashboard.models.entities.Penelitian;

import java.util.List;

public interface PenelitianService {

    List<Penelitian> getAllPenelitian();
    List<Penelitian> getAllByJudul(String judul);

    Penelitian createPenelitian(Penelitian penelitian);
    Penelitian updatePenelitian(int id, Penelitian penelitian);

    void deletePenelitian(int id);
}
