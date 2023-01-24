package com.lauracursojava.microservice5.dao;

import com.lauracursojava.microservice5.models.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository

public class UserDaoImp  implements IUserDao{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<User> getUsers() {
        String query = "FROM User";
        return  entityManager.createQuery(query).getResultList();
    }
}
