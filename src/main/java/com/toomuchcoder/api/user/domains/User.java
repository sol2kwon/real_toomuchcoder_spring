package com.toomuchcoder.api.user.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * packageName: com.toomuchcoder.api.user
 * fileName        : User.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "?")

public class User {
    @Id @Column (name = "?")
    @GeneratedValue private String username;
    @Column private @NotNull String name;
    @Column private @NotNull String password;
    @Column private @NotNull int birth;
    @Column private @NotNull String phon;

}
