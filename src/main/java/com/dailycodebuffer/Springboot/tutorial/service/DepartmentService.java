package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.hibernate.mapping.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List fetchDepartmentList();
}
