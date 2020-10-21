package com.enao.team2.quanlynhanvien.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "hocsinh")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Hocsinh {

    @Id
    private int id;
    @Column(name = "mahocsinh")
    private String mahocsinh;
    @Column(name = "hoten")
    private String hoten;
    @Column(name = "gioitinh")
    private Boolean gioitinh;
    @Column(name = "ngaysinh")
    private Date ngaysinh;
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "dienthoai")
    private int dienthoai;
    @Column(name = "dantoc")
    private String dantoc;
    @Column(name = "tongiao")
    private String tongiao;
    @Column(name = "ngayvaodoan")
    private Date ngayvaodoan;
    @Column(name = "noisinh")
    private String noisinh;
    @Column(name = "cmnd")
    private String cmnd;
    @Column(name = "lop")
    private String lop;
    @Column(name = "hotenBo")
    private String hotenBo;
    @Column(name = "hotenMe")
    private Date hotenMe;
    @Column(name = "dienthoaiBo")
    private String dienthoaiBo;
    @Column(name = "dienthoaiMe")
    private String dienthoaiMe;
    @Column(name = "dvCongTacBo")
    private String dvCongTacBo;
    @Column(name = "dvCongTacMe")
    private Date dvCongTacMe;
    @Column(name = "nguoidamho")
    private String nguoidamho;
    @Column(name = "trangthai")
    private Boolean trangthai;
    @Column(name = "anh")
    private String anh;
    @Column(name = "email")
    private String email;
    @Column(name = "images")
    private Date images;
    @Column(name = "xoa")
    private String xoa;


}
