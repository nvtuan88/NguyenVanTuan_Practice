package com.nguyenvantuan.demo.service;


import com.nguyenvantuan.demo.entity.StaffEntity;

import java.util.List;

public interface StaffService{
    List<StaffEntity> findAllStaff();
    StaffEntity createStaff(StaffEntity s);
}
