package project.java.quanliproject.presentation.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import project.java.quanliproject.application.dto.UserDto;
import project.java.quanliproject.domain.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/UserHome")
public class UserControllerImpl {


    private final UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDto> addUserEntity( @RequestBody UserDto userDto) {
        return new ResponseEntity<>(userService.createUserEntity(userDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserEntityById( @PathVariable String id) {
        UserDto userDto = userService.getUserEntityById(id);
        return ResponseEntity.ok(userDto);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<UserDto> updateUser( @PathVariable String id, @RequestBody UserDto updatedUserDto) {
        UserDto updatedUser = userService.updateUserEntity(id, updatedUserDto);
        return ResponseEntity.ok(updatedUser);
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUser() {
        List<UserDto> user = userService.getAllUser();
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser( @PathVariable String id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("Thong tin User da xoa thanh cong!");
    }
}
