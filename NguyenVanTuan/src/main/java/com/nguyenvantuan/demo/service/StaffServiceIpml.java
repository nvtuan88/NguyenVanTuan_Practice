package com.nguyenvantuan.demo.service;

import com.nguyenvantuan.demo.entity.StaffEntity;
import com.nguyenvantuan.demo.repository.StaffRepopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceIpml implements StaffService{
    @Autowired
    StaffRepopsitory repo;

    @Override
    public List<StaffEntity> findAllStaff() {
        return repo.findAll();
    }

    @Override
    public StaffEntity createStaff(StaffEntity s) {
        return repo.save(s);
    }
}
