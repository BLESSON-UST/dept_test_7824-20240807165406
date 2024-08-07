package com.UST.departmentservice.Services;

import com.UST.departmentservice.Model.Department;
import com.UST.departmentservice.Repository.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository repo;

    @Autowired
    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }
}