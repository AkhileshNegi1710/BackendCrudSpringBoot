package net.javalearning.SpringbootBackendCrud.Repository;

import net.javalearning.SpringbootBackendCrud.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

//we don't need to add respository annotation spring JPA internally take care of adding respository to JPA Respistory implementation class
@Repository
//JPA respository expect 2 entities One is Entity and other is Primary key
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//    all crud database method to interact with database
}
