package com.project.capstone.service.auth;

import com.project.capstone.dto.auth.UserLoginRequestDto;
import com.project.capstone.dto.auth.UserLoginResponseDto;

public interface UserLoginServiceInterface {
    UserLoginResponseDto login(UserLoginRequestDto userLoginRequestDto);
}
