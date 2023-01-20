package com.example.demosogetisecurity.repository;

import com.example.demosogetisecurity.model.Accounts;
import com.example.demosogetisecurity.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
    Accounts findByCustomerId(int customerId);

}
