package com.example.tp1.service;

import com.example.tp1.entity.Todolist;
import com.example.tp1.tools.ServiceHibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodolistService {
    private ServiceHibernate serviceHibernate;

    private Session session;

    public TodolistService(ServiceHibernate serviceHibernate){
        this.serviceHibernate = serviceHibernate;
        session = this.serviceHibernate.getSession();
    }

    public boolean create(Todolist todolist) {
        session.beginTransaction();
        session.persist(todolist);
        session.getTransaction().commit();
        return true;
    }

    public boolean update(Todolist todolist) {
        session.beginTransaction();
        session.persist(todolist);
        session.getTransaction().commit();
        return true;
    }

    public boolean delete(Todolist todolist) {
        session.beginTransaction();
        session.remove(todolist);
        session.getTransaction().commit();
        return true;
    }

    public Todolist findById(int id) {
        return session.find(Todolist.class, id);
    }

    public List<Todolist> findAll(boolean isDone){
        Query<Todolist> query = session.createQuery("from Todolist where isDone = :isDone ", Todolist.class);
        query.setParameter("isDone", isDone);
        return query.list();
    }

    /*
    public List<Todolist> findAllDone(){
        Query<Todolist> query = session.createQuery("from Todolist where isDone = true ", Todolist.class);
        return query.list();
    }

    public List<Todolist> findAllTodo(){
        Query<Todolist> query = session.createQuery("from Todolist where isDone = false ", Todolist.class);
        return query.list();
    }
    */
}
