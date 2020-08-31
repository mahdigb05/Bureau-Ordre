package com.bureau_ordre.bureau_ordre.Repositories;

import com.bureau_ordre.bureau_ordre.Beans.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurDao extends CrudRepository<Utilisateur,Long> {
    public Utilisateur findByEmail(String email);
}
