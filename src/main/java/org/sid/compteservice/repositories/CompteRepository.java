package org.sid.compteservice.repositories;

import org.sid.compteservice.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte,Long> {

}
