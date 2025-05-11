package ouammou.digital_banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ouammou.digital_banking.entites.BankAccount;
import ouammou.digital_banking.entites.Customer;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
    @Query("select c from Customer c where c.name like :kw")
    List<Customer> searchCustomer(@Param("kw") String keyword);
}
