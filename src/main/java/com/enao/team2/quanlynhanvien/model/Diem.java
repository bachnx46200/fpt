package com.enao.team2.quanlynhanvien.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "diem")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Diem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer stt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column
    private Date ngay;

    @Column
    private String mahocsinh;

    @Column
    private int diemmieng1;

    @Column
    private int diemmieng2;

    @Column
    private int diemmieng3;

    @Column
    private int diem15phut1;

    @Column
    private int diem15phut2;

    @Column
    private int diem15phut3;

    @Column
    private float diem1tiet1;

    @Column
    private float diem1tiet2;

    @Column
    private float diemthi;

    @Column
    private float diemTBM;

    @Column
    private String mapc;

}
