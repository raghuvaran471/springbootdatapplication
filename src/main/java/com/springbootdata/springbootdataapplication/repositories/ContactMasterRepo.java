package com.springbootdata.springbootdataapplication.repositories;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootdata.springbootdataapplication.entities.ContactsMasterEntity;
@Repository

public interface ContactMasterRepo extends CrudRepository<ContactsMasterEntity,Serializable>{
	

}
