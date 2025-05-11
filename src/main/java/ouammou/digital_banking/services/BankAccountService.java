package ouammou.digital_banking.services;

import ouammou.digital_banking.entites.Customer;
import ouammou.digital_banking.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    Customer saveCustomer(Customer customer);
    BankAccountService saveBankAccount(double initialBalance , String type, Long CustomerId) throws CustomerNotFoundException;
    List<Customer> listCustomers();
    BankAccountService getBankAccount(String accoutId);
    void debit(String accoutId, double amount , String description);
    void credit(String accoutId, double amount, String description);
    void transfer(String accountIdSource, String accoutIdDestination, double amount);
}
