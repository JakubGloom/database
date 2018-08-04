package com.databasetests.database.springdata;

import com.databasetests.database.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeSpringDataRepository
        extends JpaRepository<Employee, Integer> {
}