package com.toomuchcoder.api.user.services;

import com.toomuchcoder.api.user.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.user.service
 * fileName        : UserService.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/

public interface UserService {
    String login(User user);

    List<User> findAll();

    long count();

    void update(User user);

    void delete(User user);

    void save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);
}