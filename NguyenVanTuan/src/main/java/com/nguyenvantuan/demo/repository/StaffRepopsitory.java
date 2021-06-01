package com.nguyenvantuan.demo.repository;

import com.nguyenvantuan.demo.entity.StaffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepopsitory extends JpaRepository<StaffEntity, Integer> {
}
