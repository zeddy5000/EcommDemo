package africa.semicolon.lumexpress.data.dtos.requests;

import lombok.*;



@AllArgsConstructor
@NoArgsConstructor

public class UpdateCustomerDetail {
    private String firstName;
    private String lastName;
    private Long CustomerId;
    private String phoneNumber;
    private String imageUrl;
}
