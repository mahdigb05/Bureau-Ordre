package com.bureau_ordre.bureau_ordre.Gestionnaires;

import com.bureau_ordre.bureau_ordre.Beans.Utilisateur;
import com.bureau_ordre.bureau_ordre.Exceptions.EmailOrTelAlreadyExistException;
import com.bureau_ordre.bureau_ordre.Repositories.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurGestionnaire {

    @Autowired
    private UtilisateurDao utilisateurDao;

    public void ajouterUtilisateur(Utilisateur utilisateur){
        Utilisateur userWithSameEmail = utilisateurDao.findByEmail(utilisateur.getEmail());
        Utilisateur userWithSameTel = utilisateurDao.findByTel(utilisateur.getTel());

        if(userWithSameEmail == null && userWithSameTel == null) {
            utilisateurDao.save(utilisateur);
        }
        else if(userWithSameEmail != null && userWithSameTel != null)
            throw new EmailOrTelAlreadyExistException("email,tel");
        else if (userWithSameEmail != null)
            throw new EmailOrTelAlreadyExistException("email");
        else
            throw new EmailOrTelAlreadyExistException("tel");
    }

    public void supprimerUtilisateur(long matricule){
        utilisateurDao.deleteById(matricule);
    }

    public Utilisateur recupererUtilisateur(long matricule){
        Optional<Utilisateur> user = utilisateurDao.findById(matricule);

        return user.orElse(null);
    }

    public List<Utilisateur> recupererUtilisateurs(){
        return (List<Utilisateur>) utilisateurDao.findAll();
    }

    public Boolean isExist(long matricule){
        return utilisateurDao.existsById(matricule);
    }
}
