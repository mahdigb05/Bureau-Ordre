package com.bureau_ordre.bureau_ordre.Repositories;

import com.bureau_ordre.bureau_ordre.Beans.Departement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementDao extends CrudRepository<Departement,Long> {
}
