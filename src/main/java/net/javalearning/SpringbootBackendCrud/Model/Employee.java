package net.javalearning.SpringbootBackendCrud.Entity;

import lombok.*;

import javax.persistence.*;


//@data internally provide so many methods and generate toString method, equal method and hash methods
//@Data

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {
//    below long id is define as a primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

//    JPA will add column name by using @Column and run the spring application check JPA entity is created or not
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email_id")
    private String emailId;


//    Non Primitive data type ExpertinWork [class] and its object is expertinWork
//@OneToOne[Empoyee will have only one ExpertinWork] it is unidirectional mapping bcoz we have define expertinwork inside Employee class only but not define employee inside expertinwork class
//    so when we have object of Employee we can call expertinWork but if we have object of ExpertinWork , we cannot call Employee.
//    CascadeType.ALL saving whole expertinWork class along with Employee class.
//    cascade means related operation will be performed.
    @OneToOne(cascade = CascadeType.ALL)
    private ExpertinWork expertinWork;




}
