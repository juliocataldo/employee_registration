package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.model.EmployeeModel;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long> {

}
