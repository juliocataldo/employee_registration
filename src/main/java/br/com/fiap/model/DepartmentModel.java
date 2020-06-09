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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_DEPARTMENT")
public class DepartmentModel {

	private long idDepartment;
	private String nomeDepartment;
	private List<EmployeeModel> employees;

	public DepartmentModel() {
	}

	public DepartmentModel(long idDepartment, String nomeDepartment, List<EmployeeModel> employees) {
		super();
		this.idDepartment = idDepartment;
		this.nomeDepartment = nomeDepartment;
		this.employees = employees;
	}

	@Id
	@Column(name = "ID_DEPARTMENT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEPARTMENT_SEQ")
	@SequenceGenerator(name = "DEPARTMENT_SEQ", sequenceName = "DEPARTMENT_SEQ", allocationSize = 1)
	public long getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(long idDepartment) {
		this.idDepartment = idDepartment;
	}

	@Column(name = "NOME_DEPARTMENT")
	@NotNull(message = "Nome obrigatório")
	@Size(min = 2, max = 50, message = "NOME deve ser entre 2 e 40 caracteres")
	public String getNomeDepartment() {
		return nomeDepartment;
	}

	public void setNomeDepartment(String nomeDepartment) {
		this.nomeDepartment = nomeDepartment;
	}

	@OneToMany(mappedBy = "departments")
	public List<EmployeeModel> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeModel> employees) {
		this.employees = employees;
	}

}
