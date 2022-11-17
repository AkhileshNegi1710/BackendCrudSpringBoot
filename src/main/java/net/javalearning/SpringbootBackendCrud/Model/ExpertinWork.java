package net.javalearning.SpringbootBackendCrud.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="ExpertinWorks")
public class ExpertinWork {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int expertId;
    private String airflow;
    private String webDashboard;
    private String emailProduct;

}
