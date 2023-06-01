package com.example.CitizenService.Service;


import com.example.CitizenService.Entity.Investissement;
import com.example.CitizenService.Repository.InvestissementRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestissementServiceImpl implements InvestissementService {

    @Autowired
    private InvestissementRepositories investissementRepository;

    @Override
    public Investissement getInvestissementById(Long id) {
        Optional<Investissement> investissementOptional = investissementRepository.findById(id);
        return investissementOptional.orElse(null);
    }

    @Override
    public List<Investissement> getAllInvestissements() {
        return investissementRepository.findAll();
    }

    @Override
    public Investissement updateInvestissement(Long id, Investissement investissement) {
        Optional<Investissement> investissementOptional = investissementRepository.findById(id);
        if (investissementOptional.isPresent()) {
            Investissement existingInvestissement = investissementOptional.get();
            existingInvestissement.setMontant(investissement.getMontant());
            existingInvestissement.setDescription(investissement.getDescription());
            existingInvestissement.setTitre(investissement.getTitre());
            existingInvestissement.setTaux(investissement.getTaux());
            investissementRepository.save(existingInvestissement);
            return existingInvestissement;
        } else {
            return null;
        }
    }

    @Override
    public void addInvestissement(Investissement investissement) {
        investissementRepository.save(investissement);
    }

    @Override
    public void deleteInvestissementById(Long id) {
        investissementRepository.deleteById(id);
    }
}