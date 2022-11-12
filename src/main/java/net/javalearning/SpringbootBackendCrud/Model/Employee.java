package net.javalearning.SpringbootBackendCrud.Model;

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




}
