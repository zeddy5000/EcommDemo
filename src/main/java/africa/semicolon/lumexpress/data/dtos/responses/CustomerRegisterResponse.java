package africa.semicolon.lumexpress.data.dtos.responses;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerRegisterResponse {
    private Long userId;
    private String message;
    private int code;
}
