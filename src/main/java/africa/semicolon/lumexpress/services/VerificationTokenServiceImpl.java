package africa.semicolon.lumexpress.services;

import africa.semicolon.lumexpress.data.models.VerificationToken;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VerificationTokenServiceImpl implements VerificationTokenService{
    @Override
    public VerificationToken generateToken() {
        return null;
    }
}
