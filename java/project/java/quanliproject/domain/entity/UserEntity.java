package project.java.quanliproject.domain.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = " username")

public class UserEntity {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "username_id")
    private UserName userName;
    @OneToMany(mappedBy = "User")
    public List<Emails> getThongtinUser() {
        List<Emails> thongtinUser = null;
        return null;
    }

    public void setThongtinUser(List<Emails> thongtinUser) {
        this.userName = ;
    }

}