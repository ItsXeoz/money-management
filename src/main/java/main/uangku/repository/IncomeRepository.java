package main.uangku.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import main.uangku.models.entities.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {

} 
