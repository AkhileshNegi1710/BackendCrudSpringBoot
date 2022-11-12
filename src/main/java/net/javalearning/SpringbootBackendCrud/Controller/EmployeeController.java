package net.javalearning.SpringbootBackendCrud.Controller;

import net.javalearning.SpringbootBackendCrud.Exception.ResourceNotFoundException;
import net.javalearning.SpringbootBackendCrud.Model.Employee;
import net.javalearning.SpringbootBackendCrud.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//it contains response body annotation and this class is capable of handling requests
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

//build API to get All employee
    @GetMapping
    public List<Employee> getAllEmployee()
    {
       return employeeRepository.findAll();


    }




    //    build CREATE employee REST API
    @PostMapping
//    RequestBody will convert json body to java object(employee)
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeRepository.save(employee);

    }




//    build API to  get Employee iD
//    get employee through primary key ID
    @GetMapping("{id}")
//    to bind above id to below getEmployeeId method we use @Pathvariables
    public ResponseEntity<Employee> getEmployeeID(@PathVariable long id)
    {
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Employee NOT Exist:"+id));
//        status 200 using ok
        return ResponseEntity.ok(employee);

    }



//    build API to update employee
//if clients wants to update the details
//    Requestbody will convert json into java object
    @PutMapping("{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable long id, @RequestBody Employee employeeDetails)
    {
    Employee updateEmployee=employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Not found employee with this id:"+ id));
//    this employeeDetails will have all informations from database so we setting all the data into updateEmployee object
    updateEmployee.setFirstName(employeeDetails.getFirstName());
    updateEmployee.setLastName(employeeDetails.getLastName());
    updateEmployee.setEmailId(employeeDetails.getEmailId());

    var response =employeeRepository.save(updateEmployee);
    return ResponseEntity.ok(response);
    }



//to build delete API
    @DeleteMapping("{id}")
    public  ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id)
    {
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Not found Employee with id"+id));
        employeeRepository.delete(employee);
//        we are not passing anything to client by saying now no content is present
//        No_content status is 204 No content
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


//    to build Delete All API
    @DeleteMapping
    public ResponseEntity<HttpStatus> deleteAllemployee()
    {
        employeeRepository.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }


}


