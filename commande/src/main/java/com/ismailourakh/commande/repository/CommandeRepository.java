package com.ismailourakh.commande.repository;

import com.ismailourakh.commande.model.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
