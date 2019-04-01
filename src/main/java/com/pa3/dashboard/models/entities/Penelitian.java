package com.pa3.dashboard.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
@Table(name = "penelitian")
public class Penelitian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_penelitian")
    private int id;

    @Column(name = "judul")
    private String judul;

    @Column(name = "skim")
    private String skim;

    @Column(name = "tahun_pelaksanaan")
    @Temporal(TemporalType.DATE)
    private Date tahunPelaksanaan;

    @Column(name = "lama_kegiatan")
    private String lamaKegiatan;

    @Column(name = "createdAt", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name = "updatedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
}