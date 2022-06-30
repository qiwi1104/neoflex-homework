package qiwi.springweb.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.sql.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "full_name")
    @Pattern(regexp = "[a-zA-Zа-яА-Я\\s]+", message = "Invalid name.")
    private String fullName;
    @Pattern(regexp = "[\\w\\.]{2,50}@[\\w\\.]{2,20}", message = "Invalid email.")
    private String email;
    @Pattern(regexp = "8\\d{10}|\\+7\\d{10}", message = "Invalid phone number.")
    private String phone;
    @NotBlank(message = "Address must not be empty.")
    private String address;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
}
