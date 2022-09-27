package africa.semicolon.lumexpress.services;

import africa.semicolon.lumexpress.data.dtos.requests.CustomerRegisterRequest;
import africa.semicolon.lumexpress.data.dtos.responses.CustomerRegisterResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class  CustomerServiceImplTest {
    @Autowired
    private CustomerService customerService;
    private CustomerRegisterRequest request;

    @BeforeEach
    void setUp() {

         request = CustomerRegisterRequest.builder().email("zeddy5000@gmail.com").password("helen5000").country("Nigeria").build();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void register() {
        CustomerRegisterResponse customerRegisterResponse = customerService.register(request);
        assertThat(customerRegisterResponse).isNotNull();
        assertThat(customerRegisterResponse.getMessage()).isNotNull();
        assertThat(customerRegisterResponse.getUserId()).isGreaterThan(0);
        assertThat(customerRegisterResponse.getCode()).isEqualTo(201);


    }

    @Test
    void login() {
    }

    @Test
    void completeProfile() {
    }
}