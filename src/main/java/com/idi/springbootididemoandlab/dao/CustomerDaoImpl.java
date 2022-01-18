//package com.idi.springbootididemoandlab.dao;
//
//import com.idi.springbootididemoandlab.model.Customer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.PostConstruct;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
///**
// * @author Evgeny Borisov
// */
//@Repository
//public class CustomerDaoImpl implements CustomerDao {
//
//
//    @Autowired
//    private EntityManager em;
//
//    @Override
//    @Transactional
//    public void save(Customer customer) {
//        customer.setAge(100);
//        em.persist(customer);
//        customer.setAge(200);
//        customer.setAge(300);
////        em.flush();
//    }
//
//    @Override
//    public List<Customer> findAll() {
//       return em.createQuery("from ccc").getResultList();
//    }
//
//    @Override
//    public List<Customer> findByAgeGreaterThan(int age) {
//        return em.createQuery("from ccc where ccc.age>:age").setParameter("age",age).getResultList();
//    }
//
//    @Override
//    public Customer findById(int id) {
////        return em.find();
//        return null;
//    }
//}
//
//
//
