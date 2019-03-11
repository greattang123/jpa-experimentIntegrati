package com.example.jpaexperiment.example1.repository;

import com.example.jpaexperiment.example1.entity.Address;
import com.example.jpaexperiment.example1.entity.User;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
@Slf4j
public class UserRepository {
    @PersistenceContext
    private EntityManager em;
    public void addUserAddress(){
        User user=new User("GT");
        em.persist(user);
        Address address1=new Address("302",user);
        em.persist(address1);
        Address address2=new Address("101",user);
        em.persist(address2);

    }

}
