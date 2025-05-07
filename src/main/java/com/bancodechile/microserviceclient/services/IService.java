package com.bancodechile.microserviceclient.services;

import java.util.List;

import com.bancodechile.microserviceclient.entities.Clients;

public interface IService {
    boolean insert(Clients cl);
    List<Clients> findAll();
    Clients findById(long id);
    boolean deleteById(long id);
    boolean update(Clients cl);
}