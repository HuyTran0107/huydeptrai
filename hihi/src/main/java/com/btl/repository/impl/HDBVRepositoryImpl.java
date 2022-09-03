/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.btl.repository.impl;

import com.btl.pojo.Hdbv;
import com.btl.repository.HDBVRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class HDBVRepositoryImpl implements HDBVRepository {

    @Autowired
    private LocalSessionFactoryBean sessionFactory;


    @Override
    public Hdbv getHdbvById(int HdbvId) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        return session.get(Hdbv.class, HdbvId);
    }

    @Override
    public List<Hdbv> getHdbvs() {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        Query q = session.createQuery("From Hdbv");
        return q.getResultList();
    }

}
