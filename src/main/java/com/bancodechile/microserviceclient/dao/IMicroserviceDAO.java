package com.bancodechile.microserviceclient.dao;

import org.springframework.data.repository.CrudRepository;

import com.bancodechile.microserviceclient.entities.Clients;

public interface IMicroserviceDAO extends CrudRepository<Clients, Long> {

}