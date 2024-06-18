package main.uangku.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Income")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "income", nullable = false)
    private double income;

    @Column(name = "description", nullable = false)
    private String description;

    // Default constructor required by JPA
    public Income() {
    }

    // Constructor without ID, for creating new entities
    public Income(double income, String description) {
        this.income = income;
        this.description = description;
    }

    // Constructor with all parameters
    public Income(Long id, double income, String description) {
        this.id = id;
        this.income = income;
        this.description = description;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", income=" + income +
                ", description='" + description + '\'' +
                '}';
    }

}
