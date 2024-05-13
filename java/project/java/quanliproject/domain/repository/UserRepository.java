package project.java.quanliproject.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.java.quanliproject.domain.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
