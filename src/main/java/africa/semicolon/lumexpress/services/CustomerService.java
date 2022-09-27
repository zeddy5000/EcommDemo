package africa.semicolon.lumexpress.services;

import africa.semicolon.lumexpress.data.dtos.requests.CustomerLoginRequest;
import africa.semicolon.lumexpress.data.dtos.requests.CustomerRegisterRequest;
import africa.semicolon.lumexpress.data.dtos.requests.UpdateCustomerDetail;
import africa.semicolon.lumexpress.data.dtos.responses.CustomerLoginResponse;
import africa.semicolon.lumexpress.data.dtos.responses.CustomerRegisterResponse;
import org.springframework.stereotype.Service;


public interface CustomerService {
    CustomerRegisterResponse register(CustomerRegisterRequest registerRequest);
    CustomerLoginResponse login(CustomerLoginRequest loginRequest);
    String completeProfile(UpdateCustomerDetail updateCustomerDetail);
}
