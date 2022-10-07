package africa.semicolon.lumexpress.services.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class EmailDetails {
    private String userEmail;
    private String mailContent;
}
