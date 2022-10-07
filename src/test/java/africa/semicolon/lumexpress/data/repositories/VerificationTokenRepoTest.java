package africa.semicolon.lumexpress.data.repositories;

import africa.semicolon.lumexpress.data.models.VerificationToken;
import africa.semicolon.lumexpress.exceptions.VerificationTokenNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class VerificationTokenRepoTest {
    @Autowired
private VerificationTokenRepo verificationTokenRepo;
    private VerificationToken verificationToken;
    @BeforeEach
    void setUp() {
        verificationToken = new VerificationToken();
        verificationToken.setToken("12345");
        verificationToken.setUserEmail("zeddy5000@gmail.com");
    }
    @AfterEach
    void tearDown(){
        verificationTokenRepo.deleteAll();
    }

    @Test
    void findByUserEmail() {
        verificationTokenRepo.save(verificationToken);
        var foundToken =verificationTokenRepo.findByUserEmail("zeddy5000@gmail.com").orElseThrow(()-> new VerificationTokenNotFoundException("token not found"));
        log.info("found token ::{}",foundToken);
        assertThat(foundToken).isNotNull();
        assertThat(foundToken.getToken()).isEqualTo(verificationToken.getToken());
    }

    @Test
    void findByToken() {
        verificationTokenRepo.save(verificationToken);
        verificationTokenRepo.findByToken((verificationToken.getToken())).orElseThrow(()-> new VerificationTokenNotFoundException("token not found"));
        assertThat(verificationToken).isNotNull();
        assertThat(verificationToken.getToken()).isEqualTo("12345");
    }
}