package com.project.capstone.controller.auth;

import com.project.capstone.dto.auth.UserLoginRequestDto;
import com.project.capstone.dto.auth.UserLoginResponseDto;
import com.project.capstone.service.auth.UserLogOutServiceInterface;
import com.project.capstone.service.auth.UserLoginServiceInterface;
import com.project.capstone.service.signup.UserSignUpServiceInterface;
import com.project.capstone.service.user.UserUpdateServiceInterface;
import com.project.capstone.service.userinfo.UserInfoServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController // HTTP 요청을 처리하는 컨트롤러를 의미
@RequestMapping("/auth")
public class UserAuthController {

    private final UserLoginServiceInterface loginService;
    private final UserLogOutServiceInterface userLogOutService;

    @PostMapping("/login")
    public UserLoginResponseDto userLogIn(@RequestBody UserLoginRequestDto userLoginRequestDto) {
        // loginservice 실행해가지고!! 이제 일치하면~~ login 그리고 토큰을 지급한다.

        //사실 return은 LoginResponseDto를 해줘야한다. -> 토큰 발급해줘야지
        //맞으면 service에서 토큰을 발급하여 LoginResponseDto에 넣고 그걸 반환

        return loginService.login(userLoginRequestDto);
    }

    @PostMapping("/logout")
    public void userLogOut(){
        userLogOutService.logout();
    };

}
