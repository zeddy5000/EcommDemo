package africa.semicolon.lumexpress.data.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Getter
@Setter

public class LumExpressUser {

    private String imageUrl;
    private String firstName;

    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;

}
