package com.dailycodebuffer.Springboot.tutorial.controller;

import com.dailycodebuffer.Springboot.tutorial.entity.Staff;
import com.dailycodebuffer.Springboot.tutorial.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaffController  {
    @Autowired
    private StaffService staffService;
    @PostMapping("/staffs")
    public Staff saveStaff(@RequestBody Staff staff) {
        return staffService.saveStaff(staff);
    }
}
