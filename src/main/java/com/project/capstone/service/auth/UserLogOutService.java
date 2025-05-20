package com.project.capstone.service.auth;

import com.project.capstone.domain.user.User;
import com.project.capstone.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserLogOutService implements UserLogOutServiceInterface {

    private final UserRepository userRepository;

    @Override
    public void logout() {
        //Dto로 받는게 보안 관점에선 별로임
        String userId = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userRepository.findByUserId(userId);
        user.setJwtRefreshToken(null);
        userRepository.save(user);
    }
}
