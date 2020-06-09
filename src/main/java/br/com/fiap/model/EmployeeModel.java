package br.com.fiap.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_EMPLOYEE")
public class EmployeeModel {

	private long id;
	private String nome;
	private String email;
	private DepartmentModel departments;
	private DegreeModel degrees;

	public EmployeeModel() {
	}
	
	public EmployeeModel(long id, String nome, String email, DepartmentModel departments, DegreeModel degrees) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.departments = departments;
		this.degrees = degrees;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMPLOYEE_SEQ")
	@SequenceGenerator(name = "EMPLOYEE_SEQ", sequenceName = "EMPLOYEE_SEQ", allocationSize = 1)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "NOME")
	@NotNull(message = "Nome obrigatório")
	@Size(min = 2, max = 50, message = "Nome deve ser entre 2 e 50 caracteres")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "EMAIL")
	@NotNull(message = "E-mail Obrigatório")
	@Size(min = 2, max = 40, message = "E-mail deve ser entre 2 e 50 caracteres")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@ManyToOne
	@JoinColumn(name = "ID_DEPARTMENT", nullable = false)
	public DepartmentModel getDepartments() {
		return departments;
	}

	public void setDepartments(DepartmentModel departments) {
		this.departments = departments;
	}
	
	@ManyToOne
	@JoinColumn(name = "ID_DEGREE", nullable = false)
	public DegreeModel getDegrees() {
		return degrees;
	}


	public void setDegrees(DegreeModel degrees) {
		this.degrees = degrees;
	}
	
}
