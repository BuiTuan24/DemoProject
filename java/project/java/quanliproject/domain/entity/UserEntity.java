package project.java.quanliproject.domain.entity;


import jakarta.persistence.*;
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

    public UserEntity(String id, String userName, String email, String phonenumber) {
    }


    @OneToMany(mappedBy = "User")
    public List<Emails> getThongtinUser() {
        List<Emails> thongtinUser = null;
        return null;
    }

    public void setThongtinUser(String thongtinUser) {
        this.userName = new UserName();
    }


    @OneToMany(mappedBy = "User")
    public List<Phonenumber> getSodienthoaiUser() {
        List<Phonenumber> SodienthoaiUser = null;
        return null;
    }

    public void setSodienthoaiUser(List<Phonenumber> SodienthoaiUser) {
        this.userName = new UserName();
    }

    public void setUserName(String userName) {
    }
}