package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.DTOs.diemDTO;
import com.enao.team2.quanlynhanvien.model.Diem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface IDiemRepository extends JpaRepository<Diem, Integer> {
    @Query(value = "SELECT hs.mahocsinh, hs.hoten, hs.gioitinh, d.diemMieng1, d.diemMieng2, d.diemMieng3, d.diem15phut1, d.diem15phut2, d.diem15phut3, d.diem1Tiet1, d.diem1Tiet2, d.diemthi, d.diemTBM FROM diem d inner join hocsinh hs on d.mahocsinh = hs.mahocsinh inner join phancong pc on d.mapc = pc.mapc inner join mon m on pc.mamon = m.mamon INNER JOIN lophoc lh on pc.malop = lh.malop where lh.tenlop = ?1 and m.tenmon = ?2 and pc.hocki = ?3", nativeQuery = true)
    List<diemDTO> listByTenlopTenMonandPhancong(String tenlop, String tenmon, boolean hocki);

//    List<Diem> findByStudentID(String id);
}
