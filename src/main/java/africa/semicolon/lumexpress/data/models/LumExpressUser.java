package africa.semicolon.lumexpress.data.models;

import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@MappedSuperclass
public class LumExpressUser {

    private String imageUrl;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private boolean isEnabled;

}
