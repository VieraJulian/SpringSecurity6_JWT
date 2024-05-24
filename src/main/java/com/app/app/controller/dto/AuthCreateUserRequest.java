package com.app.app.controller.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record AuthCreateUserRequest(@NotBlank String password,
                                    @NotBlank String username,
                                    @Valid AuthCreateRoleRequest roleRequest){
}
