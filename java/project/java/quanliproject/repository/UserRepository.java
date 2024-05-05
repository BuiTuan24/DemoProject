package project.java.quanliproject.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.java.quanliproject.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
