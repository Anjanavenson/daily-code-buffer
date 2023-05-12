package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.entity.Staff;
import com.dailycodebuffer.Springboot.tutorial.repository.DepartmentRepository;
import com.dailycodebuffer.Springboot.tutorial.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class StaffServiceImplementation implements StaffService{
    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Staff saveStaff(Staff staff) {
        Staff save = staffRepository.save(staff);
        return save;
    }
}
