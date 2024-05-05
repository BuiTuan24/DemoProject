package project.java.quanliproject.service;

import project.java.quanliproject.dto.UserDto;
import java.util.List;



public interface UserService {
    UserDto createUserEntity(UserDto userDto);


    UserDto getUserEntityById(Long id);

    UserDto updateUserEntity(Long id, UserDto updatedUserDto);

    List<UserDto> getAllUser();

    void deleteUser(Long id);
}


