package com.enao.team2.quanlynhanvien.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "phancong")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhanCong {
    @Id
    @Column(unique = true)
    private UUID maphancong;
    @ManyToOne(fetch = FetchType.LAZY)
    private LopHoc lop;

    @ManyToOne(fetch = FetchType.LAZY)
    private GiaoVien giaovien;

    @Column
    private boolean vaitro;

    @ManyToOne(fetch = FetchType.LAZY)
    private Mon mon;

    @Column
    private boolean hocki;

    @ManyToOne(fetch = FetchType.LAZY)
    private NamHoc namhoc;

    @OneToMany(
            mappedBy = "phancong",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<Diem> diems = new HashSet<>();
}
