package africa.semicolon.lumexpress.data.dtos.requests;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class GetAllItemsRequest {
    private int numberOfItemsPerPage;
    private int pageNumber;
}
