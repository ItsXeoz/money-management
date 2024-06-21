package main.uangku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import main.uangku.models.entities.Income;
import main.uangku.services.IncomeServices;

@Controller
public class IndexController {

    private IncomeServices incomeServices;

    public IndexController(IncomeServices incomeServices) {
        this.incomeServices = incomeServices;
    }

    @GetMapping("/home")
    public String listIncome(Model model) {
        model.addAttribute("income", incomeServices.getAllIncomeByDate());
        return "index";
    }

    @GetMapping("/income")
    public String createIncomeForm(Model model) {
        Income income = new Income();
        model.addAttribute("income", income);
        return "income";
    }

    @PostMapping("/income")
    public String addIncome(@ModelAttribute Income income ) {
        incomeServices.saveIncome(income);
        return "redirect:/home";
    }

    @GetMapping("/expanse")
    public String expanse() {
        return "expanse";
    }
}
