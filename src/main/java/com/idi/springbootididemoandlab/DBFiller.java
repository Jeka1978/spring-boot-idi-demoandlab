package com.idi.springbootididemoandlab;

import com.idi.springbootididemoandlab.dao.CustomerDao;
import com.idi.springbootididemoandlab.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Evgeny Borisov
 */
@Component
public class DBFiller {
    @Autowired
    private CustomerDao customerDao;

    @EventListener(ContextRefreshedEvent.class)
    @Transactional
    public void fillDB() {
        customerDao.save(Customer.builder().name("Ruven").age(50).build());
        customerDao.save(Customer.builder().name("John").age(30).build());
        customerDao.save(Customer.builder().name("Jack").age(40).build());
        customerDao.save(Customer.builder().name("Jacob").age(80).build());
    }
}



