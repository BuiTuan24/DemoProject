package project.java.quanliproject.domain.service;

import project.java.quanliproject.application.dto.UserDto;
import java.util.List;
import java.util.UUID;


public interface UserService {
    UserDto createUserEntity(UserDto userDto);

    UserDto getUserEntityById(String id);

    UserDto updateUserEntity(String id, UserDto updatedUserDto);

    List<UserDto> getAllUser();

    void deleteUser(String id);
}


