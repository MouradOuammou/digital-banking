package ouammou.digital_banking.services;

import ouammou.digital_banking.entites.Customer;
import ouammou.digital_banking.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccount {
    Customer saveCustomer(Customer customer);
    BankAccount saveBankAccount(double initialBalance , String type,Long CustomerId) throws CustomerNotFoundException;
    List<Customer> listCustomers();
    BankAccount getBankAccount(String accoutId);
    void debit(String accoutId, double amount , String description);
    void credit(String accoutId, double amount, String description);
    void transfer(String accountIdSource, String accoutIdDestination, double amount);
}
