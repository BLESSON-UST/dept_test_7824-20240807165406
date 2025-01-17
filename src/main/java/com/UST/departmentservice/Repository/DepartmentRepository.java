package com.UST.departmentservice.Repository;

import com.UST.departmentservice.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentId(long departmentId);
}