package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.DTOs.diemDTO;
import com.enao.team2.quanlynhanvien.model.Diem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface IDiemRepository extends JpaRepository<Diem, Integer> {
    @Query(value = "SELECT new com.enao.team2.quanlynhanvien.DTOs.diemDTO(hocsinh.mahocsinh, hocsinh.hoten, hocsinh.gioitinh, diemMieng1, diemMieng2, diemMieng3, diem15phut1, diem15phut2, diem15phut3, diem1Tiet1, diem1Tiet2, diemthi, diemTBM FROM diem inner join hocsinh on diem.mahocsinh = hocsinh.mahocsinh inner join phancong on diem.mapc = phancong.mapc inner join mon on phancong.mamon = mon.mamon INNER JOIN lophoc on phancong.malop = lophoc.malop where lophoc.tenlop = ?1 and mon.tenmon = ?2 and phancong.hocki = ?3", nativeQuery = true)
    List<diemDTO> listByTenlopTenMonandPhancong(String tenlop, String tenmon, boolean hocki);

//    List<Diem> findByStudentID(String id);
}
