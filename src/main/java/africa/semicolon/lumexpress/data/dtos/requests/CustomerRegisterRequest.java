package africa.semicolon.lumexpress.data.dtos.requests;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRegisterRequest {
    private String email;
    private String password;
    private String country;
}
