package com.toomuchcoder.api.auth.services;

import com.toomuchcoder.api.auth.domain.Auth;
import com.toomuchcoder.api.user.domains.User;
import com.toomuchcoder.api.user.repositories.UserRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.auth.services
 * fileName        : AuthServiceImpl.java
 * author          : solyikwon
 * date            : 2022-06-05
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-05         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements UserDetailsService {


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
