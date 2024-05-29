package project.java.quanliproject.domain.service;


import org.springframework.stereotype.Service;
import project.java.quanliproject.application.dto.UserDto;
import project.java.quanliproject.domain.entity.UserEntity;
import project.java.quanliproject.application.mapper.UserMapper;
import project.java.quanliproject.domain.repository.UserRepository;
import project.java.quanliproject.domain.service.UserService;


import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDto createUserEntity(UserDto userDto) {
        UserEntity userEntity = UserMapper.mapToUserEntity(userDto);
        UserEntity savedUserEntity = userRepository.save(userEntity);
        return UserMapper.mapToUserDto(savedUserEntity);
    }

    @Override
    public UserDto getUserEntityById(String id) {

        UserEntity userEntity = userRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("User khong ton tai"));
        return UserMapper.mapToUserDto(userEntity);
    }

    @Override
    public UserDto updateUserEntity(String id, UserDto updatedUserDto) {

        UserEntity existingUserEntity = userRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("User khong ton tai"));

        existingUserEntity.setUserName(updatedUserDto.getUserName());
        existingUserEntity.setThongtinUser(updatedUserDto.getEmail());
        UserEntity updatedUserEntity = userRepository.save(existingUserEntity);
        return UserMapper.mapToUserDto(updatedUserEntity);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<UserEntity> user = userRepository.findAll();
        return user.stream()
                .map(UserMapper::mapToUserDto).collect(Collectors.toList());
    }
    @Override
    public void deleteUser(String id) {
        UserEntity userEntity = userRepository
                .findById(id)
                .orElseThrow(() -> new RuntimeException("User khong ton tai"));
        userRepository.deleteById(id);
    }
}



