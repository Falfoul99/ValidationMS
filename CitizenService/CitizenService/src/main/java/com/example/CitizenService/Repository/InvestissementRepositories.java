package com.example.CitizenService.Repository;

import com.example.CitizenService.Entity.Investissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestissementRepositories extends JpaRepository<Investissement,Long> {
}
