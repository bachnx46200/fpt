package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.DTOs.diemDTO;
import com.enao.team2.quanlynhanvien.model.Diem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDiemRepository extends JpaRepository<Diem, Integer> {
    @Query(value = "SELECT * FROM diem d inner join hocsinh hs on d.mahocsinh = hs.mahocsinh inner join phancong pc on d.mapc = pc.mapc inner join mon m on pc.mamon = m.mamon INNER JOIN lophoc lh on pc.malop = lh.malop where lh.tenlop = ?1 and m.tenmon = ?2 and pc.hocki = ?3", nativeQuery = true)
    List<Diem> listByTenlopTenMonandPhancong(String tenlop, String tenmon, boolean hocki);

    @Query(value = "SELECT * FROM diem d inner join phancong pc on d.mapc = pc.mapc where d.mahocsinh = ?1 and pc.hocki = ?2", nativeQuery = true)
    List<Diem> findBymahocsinh(String mahocsinh, boolean hocki);

}
