package africa.semicolon.lumexpress.data.dtos.requests;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerLoginRequest {
    private String email;
    private String password;
}
