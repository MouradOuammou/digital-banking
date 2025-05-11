package ouammou.digital_banking.services;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ouammou.digital_banking.entites.CurrentAccount;
import ouammou.digital_banking.entites.Customer;
import ouammou.digital_banking.exceptions.CustomerNotFoundException;
import ouammou.digital_banking.repositories.AccountOperationRepository;
import ouammou.digital_banking.repositories.BankAccountRepository;
import ouammou.digital_banking.repositories.CustomRepository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
@Slf4j //  qui permet de générer automatiquement un logger (journaliseur)
public class BankAccountServiceImpl implements BankAccount {
    private CustomRepository customerRepository;
    private BankAccountRepository bankAccountRepository;
    private AccountOperationRepository accountOperationRepository;


    @Override
    public Customer saveCustomer(Customer customer) {
        log.info("Saving new Customer");
        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer;
    }

    @Override
    public BankAccount saveBankAccount(double initialBalance, String type, Long customerId)  {
        Customer customer=customerRepository.findById(customerId).orElse(null);
        if(customer==null)
            throw new CustomerNotFoundException("Customer not found");
        CurrentAccount currentAccount=new CurrentAccount();
        currentAccount.setId(UUID.randomUUID().toString());
        currentAccount.setCreatedAt(new Date());
        currentAccount.setBalance(initialBalance);
        currentAccount.setCustomer(customer);
        CurrentAccount savedBankAccount = bankAccountRepository.save(currentAccount);
        return savedBankAccount;
    }

    @Override
    public List<Customer> listCustomers() {
        return List.of();
    }

    @Override
    public BankAccount getBankAccount(String accoutId) {
        return null;
    }

    @Override
    public void debit(String accoutId, double amount, String description) {

    }

    @Override
    public void credit(String accoutId, double amount, String description) {

    }

    @Override
    public void transfer(String accountIdSource, String accoutIdDestination, double amount) {

    }
}
