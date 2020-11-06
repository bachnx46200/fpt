package com.enao.team2.quanlynhanvien.repository;

import com.enao.team2.quanlynhanvien.model.Hocsinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface HocSinhRepository extends JpaRepository<Hocsinh, UUID> {

    @Query(value = "SELECT*FROM hocsinh WHERE mahocsinh=?1",nativeQuery = true)
    Hocsinh finrBymhs(String mahocsinh);
}
