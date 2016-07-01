package com.reno.blue.cuentas.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.reno.blue.cuentas.model.Quincena;

@Repository
public interface QuincenaRepository extends CrudRepository<Quincena, Long>{

}
