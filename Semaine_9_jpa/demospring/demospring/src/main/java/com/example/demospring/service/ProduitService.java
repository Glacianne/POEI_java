package com.example.demospring.service;

import com.example.demospring.entity.Produit;
import com.example.demospring.interfaces.IDAO;
import com.example.demospring.tools.ServiceHibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService implements IDAO<Produit> {

   // @Autowired
    private ServiceHibernate serviceHibernate;

    private Session session;

    public ProduitService(ServiceHibernate serviceHibernate){
        this.serviceHibernate = serviceHibernate;
        session = this.serviceHibernate.getSession();
    }

    @Override
    public boolean create(Produit o) {
        session.beginTransaction();
        session.persist(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean update(Produit o) {
        session.beginTransaction();
        session.persist(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean delete(Produit o) {
        session.beginTransaction();
        session.remove(o);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public Produit findById(int id) {
        return session.find(Produit.class, id);
    }

    @Override
    public List<Produit> findAll() {
        Query q1 = session.createQuery("from Produit", Produit.class);
        List<Produit> list = q1.list();
        return list;
    }
}
