package net.armanit.accounts.repository;

import net.armanit.accounts.model.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
    Account findByCustomerId(int customerId);
}
