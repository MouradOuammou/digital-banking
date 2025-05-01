package ouammou.digital_banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ouammou.digital_banking.entites.Customer;

public interface CustomRepository extends JpaRepository<Customer, Long> {
}
