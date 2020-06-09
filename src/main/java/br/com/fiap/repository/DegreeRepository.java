package br.com.fiap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.model.DegreeModel;

@Repository
public interface DegreeRepository extends JpaRepository<DegreeModel, Long> {

}
