package com.bureau_ordre.bureau_ordre.Repositories;

import com.bureau_ordre.bureau_ordre.Beans.CourrierDepart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourrierDepartDao extends CrudRepository<CourrierDepart,Long> {
}
