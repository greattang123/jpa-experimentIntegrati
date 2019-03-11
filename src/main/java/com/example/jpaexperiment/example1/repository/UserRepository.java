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
        Address address1=new Address("302");
        em.persist(address1);
        Address address2=new Address("101");
        em.persist(address2);
        List<Address> addresses=List.of(address1,address2);
        User user=new User("GT");
        user.setAddresses(addresses);
        em.persist(user);
    }
}
