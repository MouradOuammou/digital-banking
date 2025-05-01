package ouammou.digital_banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ouammou.digital_banking.entites.AccountOperation;

public interface AccountOperationRepository extends JpaRepository<AccountOperation, Long> {
}
