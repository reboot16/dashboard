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
@Table(name = "riwayat_pendidikan")
public class RiwayatPendidikan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_riwayat_pendidikan")
    private int id;

    @Column(name = "jenjang")
    private String jenjang;

    @Column(name = "gelar")
    private String gelar;

    @Column(name = "bidang_studi")
    private String bidangStudi;

    @Column(name = "perguruan_tinggi")
    private String perguruanTinggi;

    @Column(name = "tahun_lulus")
    private int tahunLulus;

    @Column(name = "createdAt", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date createdAt;

    @Column(name = "updatedAt", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    private Date updatedAt;
}