package com.bureau_ordre.bureau_ordre.Gestionnaires;

import com.bureau_ordre.bureau_ordre.Beans.*;
import com.bureau_ordre.bureau_ordre.Exceptions.EmailOrTelAlreadyExistException;
import com.bureau_ordre.bureau_ordre.Repositories.CourrierArriveDao;
import com.bureau_ordre.bureau_ordre.Repositories.CourrierDepartDao;
import com.bureau_ordre.bureau_ordre.Repositories.CourrierInternDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class CourrierGestionnaire {

    @Autowired
    private CourrierDepartDao courrierDepartDao;
    @Autowired
    private CourrierArriveDao courrierArriveDao;
    @Autowired
    private CourrierInternDao courrierInternDao;
    
    
    
    public <T extends Courrier> void ajouterCourrier(T t){

        if(t.getType() == TYPE_COURRIER.ARRIVEE){
            courrierArriveDao.save((CourrierArrive) t);
        }
        else if(t.getType() == TYPE_COURRIER.DEPART){
            courrierDepartDao.save((CourrierDepart) t);
        }
        else
            courrierInternDao.save((CourrierIntern) t);
    }

    public <T extends Courrier> void supprimerCourrier(T courrier){

        if(courrier.getType() == TYPE_COURRIER.ARRIVEE){
            courrierArriveDao.delete((CourrierArrive) courrier);
        }
        else if(courrier.getType() == TYPE_COURRIER.DEPART){
            courrierDepartDao.delete((CourrierDepart) courrier);
        }
        else
            courrierInternDao.delete((CourrierIntern) courrier);
    }

    public <T> T recupererCourrier(Long numeroCourrier, Function<Long,Optional<T>> function){
        Optional<T> t = function.apply(numeroCourrier);
        return t.orElse(null);
    }

    public List<Courrier> recupererCourriers(){

        List<CourrierArrive> courriersArrive = (List<CourrierArrive>) courrierArriveDao.findAll();
        List<CourrierDepart> courriersDepart = (List<CourrierDepart>) courrierDepartDao.findAll();
        List<CourrierIntern> courriersIntern = (List<CourrierIntern>) courrierInternDao.findAll();

        List<Courrier> courriers = new ArrayList<>();

        courriers.addAll(courriersArrive);
        courriers.addAll(courriersDepart);
        courriers.addAll(courriersIntern);

        return courriers;
    }

    public <T> Boolean isExist(Long numeroCourrier, Function<Long,Boolean> function){
        return function.apply(numeroCourrier);
    }
}
