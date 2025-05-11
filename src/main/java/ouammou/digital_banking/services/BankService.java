package ouammou.digital_banking.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ouammou.digital_banking.entites.CurrentAccount;
import ouammou.digital_banking.entites.SavingAccount;
import ouammou.digital_banking.repositories.BankAccountRepository;

@Service
@Transactional
public class BankService { }