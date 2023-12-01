package com.Priyanka.CustomerManagementSystem.Service;

import com.Priyanka.CustomerManagementSystem.DTO.CustomerDTO;
import com.Priyanka.CustomerManagementSystem.DTO.CustomerSaveDTO;
import com.Priyanka.CustomerManagementSystem.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);


    List<CustomerDTO> getAllCustomer();


    String updateCustomers(CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}
