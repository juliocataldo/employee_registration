package br.com.fiap.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.model.EmployeeModel;
import br.com.fiap.repository.DepartmentRepository;
import br.com.fiap.repository.DegreeRepository;
import br.com.fiap.repository.EmployeeRepository;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final String EMPLOYEE_FOLDER = "employee/";
	
	//Injeção de independencia
	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Autowired
	public DepartmentRepository departmentRepository;
	
	@Autowired
	public DegreeRepository degreeRepository;
	
	@GetMapping("/form")
	public String open(@RequestParam String page, 
					   @RequestParam(required = false) Long id,
					   @ModelAttribute("employeeModel") EmployeeModel EmployeeModel, 
					   Model model) {
		
		if("produto-editar".equals(page)) {
			model.addAttribute("employeeModel", employeeRepository.findById(id).get());
		}
		
		model.addAttribute("departments", departmentRepository.findAll());
		model.addAttribute("degrees", degreeRepository.findAll());
		
		return EMPLOYEE_FOLDER + page;
	}

	@GetMapping()
	public String findAll(Model model) {

		model.addAttribute("employees", employeeRepository.findAll());
		return EMPLOYEE_FOLDER +  "employees";
	}

	@GetMapping("/{id}")
	public String findById(@PathVariable("id") long id, Model model) {
		
		model.addAttribute("employee", employeeRepository.findById(id).get());
		return EMPLOYEE_FOLDER +  "employee-detalhe";
	}
	
	@PostMapping()
	public String save(@Valid EmployeeModel employeeModel, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("departments", departmentRepository.findAll());
			model.addAttribute("degrees", degreeRepository.findAll());

			return EMPLOYEE_FOLDER + "employee-novo";
		}
		
		employeeRepository.save(employeeModel);
		redirectAttributes.addFlashAttribute("messages", "Funcionário cadastrado com sucesso!");
		
		return "redirect:/employee";
	}
	
	@PutMapping("/{id}")
	public String update(@PathVariable("id") long id, @Valid EmployeeModel employeeModel, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("departments", departmentRepository.findAll());
			model.addAttribute("degrees", degreeRepository.findAll());
			
			return EMPLOYEE_FOLDER + "employee-editar";
		}
		
		employeeModel.setId(id);
		employeeRepository.save(employeeModel);
		redirectAttributes.addFlashAttribute("messages", "Funcionário alterado com sucesso!");
		
		return "redirect:/employee";
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable("id") long id, RedirectAttributes redirectAttributes) {
		
		employeeRepository.deleteById(id);
		redirectAttributes.addFlashAttribute("messages", "Funcionário excluido com sucesso!");

		return "redirect:/employee";
	}

}
