package com.proje.proje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class ProjeApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjeApplication.class, args);
	}
	@Repository
	public interface CompanyRepository extends JpaRepository<Company,Long>{
	}
	@Repository
	public  interface EmployeeRepository extends  JpaRepository<Employee, Long> {
	}
}
