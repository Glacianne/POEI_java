package org.example;

import org.example.model.Department;
import org.example.model.Employee;
import org.example.model.ParkingSpace;
import org.example.model.Project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Collection;

public class DemoLiaison {

    public static void main(String[] args) {

        //Démo one to one bidirectionnel

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Demojpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transac = em.getTransaction();

        transac.begin();

        Employee e1 = new Employee();
        e1.setId(1);
        em.persist(e1);

        ParkingSpace p1 = new ParkingSpace();
        p1.setId(1);
        p1.setLocation("rue du bonheur");
        p1.setEmp(e1);
        em.persist(p1);
        e1.setSpace(p1);

        Employee e01 = em.find(Employee.class, 1);
        System.out.println("Employé avec l'id " + e01.getId() + " est garé " + e01.getSpace().getLocation());

        ParkingSpace p01 = em.find(ParkingSpace.class, 1);
        System.out.println("A l'emplacement de parking avec l'id " + p01.getId() + " il y a l'employé " + p01.getEmp().getId());

        //----------------------------------------------------------------------------------------------------------------------

        //Démo one to many
        Employee e2 = new Employee();
        e2.setId(2);
        em.persist(e2);

        Department d1 = new Department();
        d1.setId(1);
        d1.setDname("intégrateurs web");

        Collection<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        d1.setEmps(list);

        e1.setD(d1);
        e2.setD(d1);

        em.persist(d1);

        Employee e03 = em.find(Employee.class, 1);
        Employee e04 = em.find(Employee.class, 2);

        System.out.println("L'employé " + e03.getId() + " travaille au département " + e03.getD().getDname());
        System.out.println("L'employé " + e04.getId() + " travaille au département " + e04.getD().getDname());

        Department d01 = em.find(Department.class, 1);
        Collection<Employee> emps = d01.getEmps();
        System.out.println("Liste des employés du département " + d01.getDname() + " : " );
        for (Employee emp : emps){
            System.out.println(emp.getId());
        }

        //Démo many to many
        Project projet1 = new Project();
        projet1.setId(1);
        projet1.setName("color the world");
        em.persist(projet1);

        Project projet2 = new Project();
        projet2.setId(2);
        projet2.setName("tout casser tout reconstruire");
        em.persist(projet2);

        Collection<Project> listProjets = new ArrayList<>();
        listProjets.add(projet1);
        listProjets.add(projet2);

        Employee e05 = em.find(Employee.class, 1);
        Employee e06 = em.find(Employee.class, 2);

        Collection<Employee> mesemps = new ArrayList<>();
        mesemps.add(e05);
        mesemps.add(e06);

        e05.setP(listProjets);
        e06.setP(listProjets);

        em.persist(e05);
        em.persist(e06);

        projet1.setE(mesemps);
        projet2.setE(mesemps);

        Employee e07 = em.find(Employee.class, 1);
        Employee e08 = em.find(Employee.class, 2);
        Project projet01 = em.find(Project.class, 1);
        Project projet02 = em.find(Project.class, 2);

        System.out.println("Liste des projets de l'employé " + e07.getId() + " : ");
        for (Project p : e07.getP()){
            System.out.println(p.getName());
        }
        System.out.println("Liste des projets de l'employé " + e08.getId() + " : ");
        for (Project p : e08.getP()){
            System.out.println(p.getName());
        }

        System.out.println("Liste des employés sur le projet " + projet01.getId() + " : ");
        for (Employee e : projet01.getE()){
            System.out.println(e.getId());
        }
        System.out.println("Liste des employés sur le projet " + projet02.getId() + " : ");
        for (Employee e : projet02.getE()){
            System.out.println(e.getId());
        }




        transac.commit();

        em.close();
        emf.close();
    }
}
