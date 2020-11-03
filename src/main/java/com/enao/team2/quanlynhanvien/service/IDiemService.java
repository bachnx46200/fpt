package com.enao.team2.quanlynhanvien.service;

import com.enao.team2.quanlynhanvien.DTOs.diemDTO;
import com.enao.team2.quanlynhanvien.model.Diem;
import java.util.List;


public interface IDiemService {
    List<Diem> findAll();

    List<Diem> findByStudetID(String id, boolean hocki);

    List<Diem> findByEVE(String tenlop, String tenmon, boolean hocki);
}
