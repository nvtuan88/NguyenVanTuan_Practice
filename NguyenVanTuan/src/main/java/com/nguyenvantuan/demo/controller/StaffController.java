package com.nguyenvantuan.demo.controller;

import com.nguyenvantuan.demo.entity.StaffEntity;
import com.nguyenvantuan.demo.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StaffController {
    @Autowired
    StaffService staffService;

    @GetMapping({"/", "index"})
    public String index(Model model){
        List<StaffEntity> staff =   staffService.findAllStaff();
        model.addAttribute("staff", staff);
        return "index";
    }
    @GetMapping({"/creat"})
    public String creat(Model model){
        StaffEntity staffEntity = new StaffEntity();
        model.addAttribute("staffEntity", staffEntity);
        return "create";
    }

    @PostMapping("/save")
    public String save(Model model, @ModelAttribute StaffEntity s){
        staffService.createStaff(s);
        return "redirect:/";
    }
}
