package com.enao.team2.quanlynhanvien.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "diemdanh")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiemDanh {

    @Id
    @Column(unique = true)
    private UUID id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date ngay;

    @Column
    private boolean trangthai;

    @Column
    private boolean hocki;

    @ManyToOne(fetch = FetchType.LAZY)
    private NamHoc namhoc;

    @ManyToOne(fetch = FetchType.LAZY)
    private GiaoVien giaovien;

    @ManyToOne(fetch = FetchType.LAZY)
    private Hocsinh hocsinh;
}
