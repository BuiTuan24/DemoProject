package project.java.quanliproject.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;


@Setter
@Getter
@Entity
public class UserName {
    @Setter
    @Id
    @GeneratedValue
    private UUID id;
    @Getter
    @Column(name = "username")
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }
}
