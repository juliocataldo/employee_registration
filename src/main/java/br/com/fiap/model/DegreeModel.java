package br.com.fiap.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_DEGREE")
public class DegreeModel {

	private long idDegree;
	private String nomeDegree;
	private List<EmployeeModel> employees;

	public DegreeModel() {
	}

	public DegreeModel(long idDegree, String nomeDegree, List<EmployeeModel> employees) {
		super();
		this.idDegree = idDegree;
		this.nomeDegree = nomeDegree;
		this.employees = employees;
	}

	@Id
	@Column(name = "ID_DEGREE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEGREE_SEQ")
	@SequenceGenerator(name = "DEGREE_SEQ", sequenceName = "DEGREE_SEQ", allocationSize = 1)
	public long getIdDegree() {
		return idDegree;
	}

	public void setIdDegree(long idDegree) {
		this.idDegree = idDegree;
	}

	@Column(name = "NOME_DEGREE")
	public String getNomeDegree() {
		return nomeDegree;
	}

	public void setNomeDegree(String nomeDegree) {
		this.nomeDegree = nomeDegree;
	}

	@OneToMany(mappedBy = "degrees")
	public List<EmployeeModel> getEmployee() {
		return employees;
	}

	public void setEmployee(List<EmployeeModel> employees) {
		this.employees = employees;
	}

	

}
