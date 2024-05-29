package project.java.quanliproject.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import project.java.quanliproject.domain.entity.Emails;
import project.java.quanliproject.domain.entity.Phonenumber;
import project.java.quanliproject.domain.entity.UserName;

import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    @NotNull
    private String id;

    private String userName;

    private String email;

    private String phonenumber;


    public UserDto(UUID id, UserName userName, List<Emails> thongtinUser, List<Phonenumber> sodienthoaiUser) {
    }
}

