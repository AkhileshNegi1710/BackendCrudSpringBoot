package net.javalearning.SpringbootBackendCrud;

import net.javalearning.SpringbootBackendCrud.Model.Employee;
import net.javalearning.SpringbootBackendCrud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class SpringbootBackendCrudApplication implements CommandLineRunner {

	public class SpringbootBackendCrudApplication{
	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendCrudApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


	//	CommandLIneRunner implements run method
//	@Override
//	public void run(String... args) throws Exception {
////		Employee database entity
//		Employee obj= new Employee();
//
//		//		columns of table
//		obj.setFirstName("Akhilesh");
//		obj.setLastName("Negi");
//		obj.setEmailId("akki@bidgely.com");
//		employeeRepository.save(obj);
//
//		Employee obj1= new Employee();
//		obj1.setFirstName("Prashant");
//		obj1.setLastName("Singh");
//		obj1.setEmailId("prashant@bidgely.com");
//		employeeRepository.save(obj1);
//	}
}
