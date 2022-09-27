package africa.semicolon.lumexpress.data.dtos.responses;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerLoginResponse {
    private String message;
    private int code;
}
