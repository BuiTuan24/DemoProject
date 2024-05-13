package project.java.quanliproject.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

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


}

