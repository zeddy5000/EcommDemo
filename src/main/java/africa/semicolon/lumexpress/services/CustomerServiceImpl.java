package africa.semicolon.lumexpress.services;

import africa.semicolon.lumexpress.data.dtos.requests.CustomerLoginRequest;
import africa.semicolon.lumexpress.data.dtos.requests.CustomerRegisterRequest;
import africa.semicolon.lumexpress.data.dtos.requests.UpdateCustomerDetail;
import africa.semicolon.lumexpress.data.dtos.responses.CustomerLoginResponse;
import africa.semicolon.lumexpress.data.dtos.responses.CustomerRegisterResponse;
import africa.semicolon.lumexpress.data.models.Address;
import africa.semicolon.lumexpress.data.models.Cart;
import africa.semicolon.lumexpress.data.models.Customer;
import africa.semicolon.lumexpress.data.repositories.CustomerRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepo customerRepo;
    private final ModelMapper modelMapper = new ModelMapper() ;

    @Override
    public CustomerRegisterResponse register(CustomerRegisterRequest registerRequest) {
        Customer customer = modelMapper.map(registerRequest,Customer.class);
        customer.setCart(new Cart());
        Address customerAddress = new Address();
        customerAddress.setCountry(registerRequest.getCountry());
        customer.getAddress().add(customerAddress);
        Customer savedCustomer = customerRepo.save(customer);
        log.info("customer to be saved in db::{}",savedCustomer);
        return registerationResponseBuilder(savedCustomer);
    }
    private CustomerRegisterResponse registerationResponseBuilder(Customer customer){
          return   CustomerRegisterResponse.builder()
                    .message("success")
                    .userId(customer.getId())
                    .code(201)
                    .build();
    }

    @Override
    public CustomerLoginResponse login(CustomerLoginRequest loginRequest) {
        return null;
    }

    @Override
    public String completeProfile(UpdateCustomerDetail updateCustomerDetail) {
        return null;
    }
}
