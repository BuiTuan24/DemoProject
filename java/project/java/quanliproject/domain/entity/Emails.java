package project.java.quanliproject.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class Emails {


    @Id
    private String id;
    private  String user;

    public UserEntity getUser() {
        UserEntity user = new UserEntity();
        return user;
    }
    public void setUser(UserEntity user) {
        this.user = user.toString();
    }
}

