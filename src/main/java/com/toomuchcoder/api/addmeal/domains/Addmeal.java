package com.toomuchcoder.api.addmeal.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * packageName: com.toomuchcoder.api.addmeal.domains
 * fileName        : addmeal.java
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

public class Addmeal {
    @Id
    @Column(name = "?")
    @GeneratedValue private Long username;
    @Column private @NotNull String timestamp;
    @Column private @NotNull String userimages;

}

