package project.java.quanliproject.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {

    @NotNull
    private Long id;

    private String userName;

    private String email;

    private String phonenumber;


}

