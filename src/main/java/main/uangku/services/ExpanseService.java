package main.uangku.services;

import java.util.List;
import main.uangku.models.entities.Income;

public interface ExpanseService{
    List <Income> getAllExpanseByDate();
    String saveExpanse(Income income);
    public int getTotalExpanse();

    
} 
