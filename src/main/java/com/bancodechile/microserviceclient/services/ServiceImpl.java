package com.bancodechile.microserviceclient.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancodechile.microserviceclient.dao.IMicroserviceDAO;
import com.bancodechile.microserviceclient.entities.*;
import com.bancodechile.microserviceclient.exceptions.ClientNotFoundException;

@Service
public class ServiceImpl implements IService{


    @Autowired
    private IMicroserviceDAO dao;

    @Override
    public boolean insert(Clients cl) {
        if(cl.getId()==0){
            return dao.save(cl)!=null;
        }

        return false;
    }

    @Override
    public List<Clients> findAll() {
        return (List<Clients>) dao.findAll();
            
    }

    @Override
    public Clients findById(long id) {
       return dao.findById(id)
       .orElseThrow(()->new  ClientNotFoundException("client desn't exists "+id));
    }

    @Override
    public boolean deleteById(long id) {
        if(dao.existsById(id)){
            dao.deleteById(id);
            return true;
        }
        throw new ClientNotFoundException("client doesn't exists "+id);
    }

    @Override
    public boolean update(Clients cl) {
        if(dao.existsById(cl.getId())){
           return dao.save(cl)!=null;
        }
        throw new ClientNotFoundException("client doesn't exists "+cl.getId());
    }
}