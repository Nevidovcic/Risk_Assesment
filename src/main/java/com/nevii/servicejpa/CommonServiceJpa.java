package com.nevii.servicejpa;

import java.io.Serializable;
import java.util.List;

public interface CommonServiceJpa <T, ID extends Serializable> {
    
    T save(T entity);
    T update(T entity);
    void delete(T entity);
    T findById(ID id);
    List<T> findAll();

}
