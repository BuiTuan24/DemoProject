package project.java.quanliproject.mapper;


import project.java.quanliproject.dto.UserDto;
import project.java.quanliproject.entity.UserEntity;

public class UserMapper {
    public static UserEntity mapToUserEntity(UserDto userDto){
        UserEntity userEntity = new UserEntity(
                userDto
                        .getId(),
                userDto
                        .getUserName(),
                userDto
                        .getEmail(),
                userDto
                        .getPhonenumber()
        );

        return userEntity;
    }

    public static UserDto mapToUserDto(UserEntity userEntity){
        UserDto userDto = new UserDto(
                userEntity
                        .getId(),
                userEntity
                        .getUserName(),
                userEntity
                        .getEmail(),
                userEntity
                        .getPhonenumber()
        );

        return userDto;
    }
}