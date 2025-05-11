package ouammou.digital_banking.mappers;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import ouammou.digital_banking.dtos.CustomerDTO;
import ouammou.digital_banking.entites.Customer;
//MapStruct Generer ce code technique
@Service
public class BankAccountMapperImpl {
    public CustomerDTO fromCustomer(Customer customer){
        CustomerDTO customerDTO=new CustomerDTO();
        BeanUtils.copyProperties(customer,customerDTO); //Simplifier au lieu de set chaque fois Dynamiquent
        return  customerDTO;
    }
    public Customer fromCustomerDTO(CustomerDTO customerDTO){
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerDTO,customer);
        return  customer;
    }
}
