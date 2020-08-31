package com.bureau_ordre.bureau_ordre.Gestionnaires;

import com.bureau_ordre.bureau_ordre.Beans.BoUserDetail;
import com.bureau_ordre.bureau_ordre.Beans.Utilisateur;
import com.bureau_ordre.bureau_ordre.Repositories.UtilisateurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service
public class BoDetailService implements UserDetailsService {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @Override
    public BoUserDetail loadUserByUsername(String email) throws UsernameNotFoundException {
        Utilisateur utilisateur = utilisateurDao.findByEmail(email);
        if(utilisateur == null)
        {
            throw new UsernameNotFoundException(email);
        }
        BoUserDetail userDetail = new BoUserDetail(utilisateur);
        return userDetail;
    }
}
