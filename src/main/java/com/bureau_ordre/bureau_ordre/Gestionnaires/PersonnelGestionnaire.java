package com.bureau_ordre.bureau_ordre.Gestionnaires;

import com.bureau_ordre.bureau_ordre.Beans.Personnel;
import com.bureau_ordre.bureau_ordre.Repositories.PersonnelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PersonnelGestionnaire {

    @Autowired
    private PersonnelDao personnelDao;

    public List<Personnel> recupererPersonnel(){
        return (List<Personnel>) personnelDao.findAll();
    }

}
