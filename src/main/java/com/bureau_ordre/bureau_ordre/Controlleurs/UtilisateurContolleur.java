package com.bureau_ordre.bureau_ordre.Controlleurs;

import com.bureau_ordre.bureau_ordre.Beans.Utilisateur;
import com.bureau_ordre.bureau_ordre.Gestionnaires.UtilisateurGestionnaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UtilisateurContolleur {

    @Autowired
    private UtilisateurGestionnaire utilisateurGestionnaire;

    @PostMapping("/ADMIN/ajouterUtilisateur")
    @PutMapping("/ADMIN/modifierUtilisateur")
    public ResponseEntity<?> ajouterUtilisateur(@Valid @RequestBody Utilisateur utilisateur)
    {
        utilisateurGestionnaire.ajouterUtilisateur(utilisateur);
        return new ResponseEntity<>(utilisateur, HttpStatus.OK);
    }

    @DeleteMapping("/ADMIN/suprimerUtilisateur/{id}")
    public ResponseEntity<?> supprimerUtilisateur(@PathVariable long id)
    {
        utilisateurGestionnaire.supprimerUtilisateur(id);
        return new ResponseEntity<>("utilisateur supprimer avec succes",HttpStatus.OK);
    }

    @GetMapping("/ADMIN/utilisateurs")
    public ResponseEntity<?> recupererUtilisateurs(){
        List<Utilisateur> utilisateurs = utilisateurGestionnaire.recupererUtilisateurs();
        return new ResponseEntity<>(utilisateurs,HttpStatus.OK);
    }


}
