package com.example.CitizenService.Controller;

import java.util.List;


import com.example.CitizenService.Entity.Investissement;
import com.example.CitizenService.Service.InvestissementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/investissements")
public class InvestissementController {

    @Autowired
    private InvestissementService investissementService;

    @GetMapping("")
    public List<Investissement> getAllInvestissements() {
        return investissementService.getAllInvestissements();

    }

    @GetMapping("/{id}")
    public Investissement getInvestissementById(@PathVariable Long id) {
        return investissementService.getInvestissementById(id);
    }

    @PostMapping("/add")
    public void addInvestissement(@RequestBody Investissement investissement) {
        investissementService.addInvestissement(investissement);
    }

    @PutMapping("/{id}")
    public void updateInvestissement(@RequestBody Investissement investissement, @PathVariable Long id) {
        investissementService.updateInvestissement(id, investissement);
    }

    @DeleteMapping("/{id}")
    public void deleteInvestissementById(@PathVariable Long id) {
        investissementService.deleteInvestissementById(id);
    }
}


