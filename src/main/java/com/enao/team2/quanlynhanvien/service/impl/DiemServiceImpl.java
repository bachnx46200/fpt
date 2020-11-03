package com.enao.team2.quanlynhanvien.service.impl;

import com.enao.team2.quanlynhanvien.DTOs.diemDTO;
import com.enao.team2.quanlynhanvien.model.Diem;
import com.enao.team2.quanlynhanvien.repository.IDiemRepository;
import com.enao.team2.quanlynhanvien.service.IDiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiemServiceImpl implements IDiemService {

    @Autowired
    private IDiemRepository diemRepository;

    @Override
    public List<Diem> findAll() {
        return diemRepository.findAll();
    }

    @Override
    public List<Diem> findByStudetID(String id, boolean hocki) {
        return diemRepository.findBymahocsinh(id, hocki);
    }

    @Override
    public List<Diem> findByEVE(String tenlop, String tenmon, boolean hocki) {
        return diemRepository.listByTenlopTenMonandPhancong(tenlop, tenmon, hocki);
    }
}
