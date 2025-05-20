package com.project.capstone.controller.userinfo;

import com.project.capstone.dto.userinfo.UserInfoRequestDto;
import com.project.capstone.dto.userinfo.UserInfoUpdateRequestDto;
import com.project.capstone.service.userinfo.UserInfoServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("users")
public class UserProfileController {

    private final UserInfoServiceInterface userInfoService;

    @PostMapping("/info")
    public void registerUserInfo(@RequestBody UserInfoRequestDto userInfoRequestDto) {
        userInfoService.saveUserInfo(userInfoRequestDto);
    }

    @PutMapping("/info")
    public void changeUserInfo(@RequestBody UserInfoUpdateRequestDto userInfoUpdateRequestDto) {
        userInfoService.updateUserInfo(userInfoUpdateRequestDto);
    }
}
