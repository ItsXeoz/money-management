package main.uangku.services.impl;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import main.uangku.models.entities.Income;
import main.uangku.repository.IncomeRepository;
import main.uangku.services.IncomeServices;

@Service
public class IncomeServicesImpl implements IncomeServices {

    private final IncomeRepository incomeRepository;

    public IncomeServicesImpl(IncomeRepository incomeRepository) {
        this.incomeRepository = incomeRepository;
    }

    @Override
    public List<Income> getAllIncomeByDate() {
        return incomeRepository.findAll(Sort.by(Sort.Direction.DESC, "date"));
    }

    @Override
    public Income saveIncome(Income income) {
        income.setCategory("Income");
        income.setDate(new Date());
        return incomeRepository.save(income);
    }
}
