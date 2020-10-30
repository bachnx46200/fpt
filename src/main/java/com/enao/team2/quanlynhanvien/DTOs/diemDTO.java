package com.enao.team2.quanlynhanvien.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class diemDTO {
    private String mahochinh;
    private String hoten;
    private boolean gioitinh;
    private int diemMieng1;
    private int diemMieng2;
    private int diemMieng3;
    private int diem15phut1;
    private int diem15phut2;
    private int diem15phut3;
    private float diem1Tiet1;
    private float diem1Tiet2;
    private float diemthi;
    private float diemTBM;
}
