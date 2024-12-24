package com.ismailourakh.commande.service;

import com.ismailourakh.commande.model.Commande;
import com.ismailourakh.commande.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    public Commande saveCommande(Commande commande) {
        return commandeRepository.save(commande);
    }
}
