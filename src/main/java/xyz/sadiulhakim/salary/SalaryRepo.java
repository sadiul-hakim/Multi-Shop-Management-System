package xyz.sadiulhakim.salary;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepo extends JpaRepository<Salary, Integer> {
}
