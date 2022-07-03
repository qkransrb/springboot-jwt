package com.example.silverninejwt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotNull
    @Size(min = 3, max = 50)
    private String username;

    @NotNull
    @Size(min = 3, max = 10)
    @JsonProperty(
            access = JsonProperty.Access.WRITE_ONLY
    )
    private String password;

    @NotNull
    @Size(min = 3, max = 50)
    private String nickname;
}
