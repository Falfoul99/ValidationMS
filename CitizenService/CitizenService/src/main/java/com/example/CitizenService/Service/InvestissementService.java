package com.example.CitizenService.Service;


import com.example.CitizenService.Entity.Investissement;

import java.util.List;
public interface InvestissementService {


    Investissement getInvestissementById(Long id);

    List<Investissement> getAllInvestissements();

    Investissement updateInvestissement(Long id, Investissement investissement);


    void addInvestissement(Investissement investissement);

    void deleteInvestissementById(Long id);


}
