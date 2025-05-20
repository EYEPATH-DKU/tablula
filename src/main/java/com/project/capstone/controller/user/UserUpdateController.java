package com.project.capstone.controller.user;

import com.project.capstone.dto.user.UserUpdateRequestDto;
import com.project.capstone.service.user.UserUpdateServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserUpdateController {

    private final UserUpdateServiceInterface userUpdateService;

    @PutMapping
    public String changeUser(@RequestBody UserUpdateRequestDto userUpdateDto) {
        //일단 검증하고나서, 이후 로직
        userUpdateService.updateUser(userUpdateDto);
        return "사용자 변경이 완료되었습니다.";
    }

}
