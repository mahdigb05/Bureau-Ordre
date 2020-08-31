package com.bureau_ordre.bureau_ordre.Repositories;

import com.bureau_ordre.bureau_ordre.Beans.Personnel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnelDao extends CrudRepository<Personnel,Long> {
}
