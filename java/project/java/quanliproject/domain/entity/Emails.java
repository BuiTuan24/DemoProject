package project.java.quanliproject.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emails {

    @Id
    private String id;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public UserEntity getUser() {
        UserEntity user = new UserEntity();
        return user;
    }
    public void setUser(UserEntity user) {
        this.user = user;
    }
}

