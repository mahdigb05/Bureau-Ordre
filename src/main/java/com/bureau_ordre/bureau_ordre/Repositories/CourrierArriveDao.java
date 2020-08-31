package com.bureau_ordre.bureau_ordre.Repositories;

import com.bureau_ordre.bureau_ordre.Beans.CourrierArrive;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourrierArriveDao extends CrudRepository<CourrierArrive,Long> {
}
