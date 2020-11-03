package com.enao.team2.quanlynhanvien.controller;

import com.enao.team2.quanlynhanvien.model.Diem;
import com.enao.team2.quanlynhanvien.service.IDiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/fpt/final")
public class DiemController {
    @Autowired
    IDiemService diemService;

    @GetMapping("/all")
    public ResponseEntity<?> getall(){
        List<Diem> list = diemService.findAll();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<?> getbythem(@RequestParam(value = "tenlop", required = false)String tenlop,
                                       @RequestParam(value = "tenmon", required = false)String tenmon,
                                        @RequestParam(value = "hocki", required = false)boolean ki){
        List<Diem> list = diemService.findByEVE(tenlop, tenmon, ki);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/getByStudentId")
    ResponseEntity<?> getBy(@PathVariable String id, @RequestParam(value = "hocki", required = false)boolean ki){
        List<Diem> list = diemService.findByStudetID(id, ki);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
