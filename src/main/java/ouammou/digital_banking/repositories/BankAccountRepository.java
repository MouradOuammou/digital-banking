package ouammou.digital_banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ouammou.digital_banking.entites.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
